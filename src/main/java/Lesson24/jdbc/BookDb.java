package Lesson24.jdbc;


import Lesson24.dto.Book;
import Lesson24.dto.AuthorDto;
import Lesson24.dto.BookDto;
import Lesson24.Online24.entity.DbRunner;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.sql.*;
import java.util.*;

@UtilityClass
public class BookDb {
    private final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows(SQLException.class)
    public void dropBooksAndAuthorsIfExists() {
        try (final Connection connection = getConnection();
             PreparedStatement dropIfExistsTableBooks = connection.prepareStatement("drop table if exists books");
             PreparedStatement dropIfExistsTableAuthors = connection.prepareStatement("drop table if exists authors")) {
            dropIfExistsTableBooks.execute();
            dropIfExistsTableAuthors.execute();
        }
    }

    @SneakyThrows(SQLException.class)
    public Optional<Integer> insertAuthor(AuthorDto author) {
        final String authorName = author.getAuthorName();
        if (StringUtils.isBlank(authorName)) {
            return Optional.empty();
        }

        try (final Connection connection = getConnection();
             final PreparedStatement authorStatement = connection.prepareStatement("insert into authors(name) values(?)");
             final PreparedStatement searchAuthorStatement = connection.prepareStatement("select id from authors where name = ?")
        ) {
            authorStatement.setString(1, authorName);
            authorStatement.execute();
            searchAuthorStatement.setString(1, authorName);
            final ResultSet resultSet = searchAuthorStatement.executeQuery();
            while (resultSet.next()) {
                return Optional.of(resultSet.getInt("id"));
            }
        }
        return Optional.empty();
    }

    @SneakyThrows(SQLException.class)
    public void insertBook(Integer authorId, BookDto bookDto) {
        try (final Connection connection = getConnection();
             final PreparedStatement fullBookStatement = connection.prepareStatement(
                     """
                             insert into books(isbn, title, url, price, pages, author_id)
                             values (?, ?, ?, ?, ?, ?)
                             """
             );
             final PreparedStatement bookStatementWithoutAuthor = connection.prepareStatement(
                     """
                             insert into books(isbn, title, url, price, pages)
                             values (?, ?, ?, ?, ?)
                             """
             )
        ) {
            if (authorId != null) {
                fullBookStatement.setString(1, bookDto.getIsbn());
                fullBookStatement.setString(2, bookDto.getTitle());
                fullBookStatement.setString(3, bookDto.getUrl());
                fullBookStatement.setBigDecimal(4, bookDto.getPrice());
                fullBookStatement.setInt(5, bookDto.getPages());
                fullBookStatement.setInt(6, authorId);
                fullBookStatement.execute();
            } else {
                bookStatementWithoutAuthor.setString(1, bookDto.getIsbn());
                bookStatementWithoutAuthor.setString(2, bookDto.getTitle());
                bookStatementWithoutAuthor.setString(3, bookDto.getUrl());
                bookStatementWithoutAuthor.setBigDecimal(4, bookDto.getPrice());
                bookStatementWithoutAuthor.setInt(5, bookDto.getPages());
                bookStatementWithoutAuthor.execute();
            }
        }
    }


    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
    }

    @SneakyThrows(SQLException.class)
    public void createBooksAndAuthors() {
        try (final Connection connection = getConnection();
             PreparedStatement createTableAuthors = connection.prepareStatement("""
                                             create table authors
                                             (
                                                 id   int auto_increment,
                                                 name varchar(100) not null unique,
                                                 constraint authors_pk
                                                     primary key (id)
                                             );
                     """);
             final PreparedStatement createTableBooks = connection.prepareStatement("""
                     create table books
                     (
                         id        int auto_increment,
                         isbn      varchar(17)   not null unique ,
                          title     varchar(100)  not null,
                         url       varchar(4000) null,
                         price     numeric       null,
                         pages     int           null,
                         author_id int           null,
                         constraint books_pk
                             primary key (id),
                         constraint books_authors_id_fk
                             foreign key (author_id) references authors (id)
                     );
                     """)) {
            createTableAuthors.execute();
            createTableBooks.execute();
        }
    }

    @SneakyThrows(SQLException.class)
    public List<Book> searchByTitleOrAuthor(String text) {
        try (final Connection connection = getConnection();
             PreparedStatement searchStatement = connection.prepareStatement("""
                     select b.isbn, b.title, b.url, b.pages, b.price, a.name from books b
                     left join authors a
                     on b.author_id = a.id
                     where lower(b.title) like ? or lower(a.name) like ?
                     """)
        ) {
            searchStatement.setString(1, "%" + text + "%");
            searchStatement.setString(2, "%" + text + "%");
            ResultSet resultSet = searchStatement.executeQuery();
            List<Book> result = new ArrayList<>();
            while (resultSet.next()) {
                result.add(new Book(resultSet.getString("isbn"),
                        resultSet.getString("title"),
                        resultSet.getString("url"),
                        resultSet.wasNull() ? null: resultSet.getInt("pages"),
                        resultSet.getString("name"),
                        resultSet.getBigDecimal("price")));
            }
            return result;
        }
    }
}

package Lesson24;

import Lesson24.csv.CsvMapper;
import Lesson24.dto.AuthorDto;
import Lesson24.dto.BookDto;
import Lesson24.jdbc.BookDb;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("Удаление если есть таблицы книг и авторов");
        BookDb.dropBooksAndAuthorsIfExists();
        System.out.println("Создание таблиц книг и авторов");
        BookDb.createBooksAndAuthors();
        System.out.println("Наполним из ресурсного файла");
        CsvMapper.getBookInfo().stream().map(book ->
                Pair.of(new AuthorDto(book.getAuthor()),
                        new BookDto(book.getIsbn(),
                                book.getTitle(),
                                book.getUrl(),
                                book.getPages(),
                                book.getPrice()))).forEach(pair -> {
                    final Optional<Integer> author = BookDb.insertAuthor(pair.getLeft());
                    BookDb.insertBook(author.orElse(null), pair.getRight());
                }
        );
        System.out.println("Выполнение завершено");
    }
}

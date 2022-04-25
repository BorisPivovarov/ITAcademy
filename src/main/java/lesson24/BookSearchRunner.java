package lesson24;

import lesson24.dto.Book;
import lesson24.jdbc.BookDb;

import java.util.List;
import java.util.Scanner;

public class BookSearchRunner {
    private static final String EXIT = "выход";
    public static void main(String[] args) {
        System.out.printf("Введите имя искомой книги или имя автора, для выхода введите %s \n", EXIT);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String text = scanner.nextLine();
            if (EXIT.equalsIgnoreCase(text)) {
                return;
            }
            final List<Book> books = BookDb.searchByTitleOrAuthor(text);
            System.out.println("Искомый запрос: " + books);
        }
    }
}

package az.vtb.service;

import az.vtb.model.Book;

import java.util.Scanner;
import java.util.UUID;

public class BookService {
    public Book createBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book description: ");
        String description = sc.nextLine();

        var book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle(title);
        book.setDescription(description);

        return book;
    }
}

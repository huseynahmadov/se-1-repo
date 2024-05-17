package az.vtb.service;

import az.vtb.model.Author;
import az.vtb.model.Book;

import java.util.Scanner;
import java.util.UUID;

import static az.vtb.config.MockDB.authors;

public class AuthorService {

    private final BookService bookService = new BookService();

    public void createAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String name = sc.nextLine();
        System.out.print("Enter author surname: ");
        String surname = sc.nextLine();

        var author = new Author();
        author.setId(UUID.randomUUID().toString());
        author.setName(name);
        author.setSurname(surname);

        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                break;
            }
        }

        Book book = bookService.createBook();


        for (int i = 0; i < author.getBooks().length; i++) {
            if (author.getBooks()[i] == null) {
                author.getBooks()[i] = book;
                break;
            }
        }

        getAllAuthors();
    }

    public void getAllAuthors() {
        for (Author author : authors) {
            if (author != null) {
                System.out.println(author);
            }
        }
    }
}

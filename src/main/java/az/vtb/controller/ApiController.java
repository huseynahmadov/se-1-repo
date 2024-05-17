package az.vtb.controller;

import az.vtb.service.AuthorService;

public class ApiController {
    public static void main(String[] args) {
        var authorService = new AuthorService();
        authorService.createAuthor();
    }
}

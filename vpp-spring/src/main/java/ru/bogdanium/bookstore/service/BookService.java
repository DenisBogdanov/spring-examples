package ru.bogdanium.bookstore.service;


import ru.bogdanium.bookstore.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooksByAuthor(String author);

    List<Book> getAllRecommendedBooks(String userId);

    Book getBookByIsbn(String isbn);

    List<Book> getEntireCatalogue();

    void registerNewBook(Book newBook);
}

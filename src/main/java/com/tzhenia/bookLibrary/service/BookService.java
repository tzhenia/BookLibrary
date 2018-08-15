package com.tzhenia.bookLibrary.service;

import com.tzhenia.bookLibrary.model.Book;
import java.util.List;

/**
 * Service interface for {@link Book} class.
 */

public interface BookService {

    Book getById(Long id);

    void save(Book customer);

    void delete(Long id);

    List<Book> getAll();
}

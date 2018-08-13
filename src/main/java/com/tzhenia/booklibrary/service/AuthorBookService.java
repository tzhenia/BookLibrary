package com.tzhenia.booklibrary.service;

import com.tzhenia.booklibrary.model.Author;
import com.tzhenia.booklibrary.model.AuthorBook;

import java.util.HashMap;
import java.util.List;

/**
 * Service interface for {@link AuthorBook} class.
 */

public interface AuthorBookService {

    AuthorBook getById(Long id);

    void save(AuthorBook authorBook);

    void delete(Long id);

    List<AuthorBook> getAll();

    HashMap<Long, Integer> calculateBookByAuthor();

    Author findTheBestAuthor();
}

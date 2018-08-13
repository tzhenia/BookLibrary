package com.tzhenia.booklibrary.service;

import com.tzhenia.booklibrary.model.Author;

import java.text.ParseException;
import java.util.List;

/**
 * Service interface for {@link Author} class.
 */

public interface AuthorService {

    Author getById(Long id);

    void save(Author author);

    void delete(Long id);

    List<Author> getAll();

    List<Author> getAllByYear(byte year) throws ParseException;
}

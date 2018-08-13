package com.tzhenia.bookLibrary.service;

import com.tzhenia.bookLibrary.model.Author;
import java.util.List;

/**
 * Service interface for {@link Author} class.
 */

public interface AuthorService {

    Author getById(Long id);

    void save(Author customer);

    void delete(Long id);

    List<Author> getAll();
}

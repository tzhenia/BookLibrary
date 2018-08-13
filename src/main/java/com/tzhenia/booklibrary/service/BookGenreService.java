package com.tzhenia.booklibrary.service;

import com.tzhenia.booklibrary.model.BookGenre;

import java.util.List;

/**
 * Service interface for {@link BookGenre} class.
 */

public interface BookGenreService {

    BookGenre getById(Long id);

    List<BookGenre> getAll();
}

package com.tzhenia.bookLibrary.service;

import com.tzhenia.bookLibrary.model.BookGenre;
import java.util.List;

/**
 * Service interface for {@link BookGenre} class.
 */

public interface BookGenreService {

    BookGenre getById(Long id);

    List<BookGenre> getAll();
}

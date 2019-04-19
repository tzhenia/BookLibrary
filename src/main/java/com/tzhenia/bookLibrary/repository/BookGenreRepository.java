package com.tzhenia.bookLibrary.repository;

import com.tzhenia.bookLibrary.model.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link BookGenre} class
 */

public interface BookGenreRepository extends JpaRepository<BookGenre, Long> {
}







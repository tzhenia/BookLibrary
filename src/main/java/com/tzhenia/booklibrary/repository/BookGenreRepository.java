package com.tzhenia.booklibrary.repository;

import com.tzhenia.booklibrary.model.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link BookGenre} class
 */

public interface BookGenreRepository extends JpaRepository<BookGenre, Long> {
}







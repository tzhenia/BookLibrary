package com.tzhenia.bookLibrary.repository;

import com.tzhenia.bookLibrary.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link AuthorBook} class
 */

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Long> {
}







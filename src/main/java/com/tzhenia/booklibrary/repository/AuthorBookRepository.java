package com.tzhenia.booklibrary.repository;

import com.tzhenia.booklibrary.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link AuthorBook} class
 */

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Long> {
}







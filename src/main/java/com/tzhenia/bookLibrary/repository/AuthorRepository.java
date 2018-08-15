package com.tzhenia.bookLibrary.repository;

import com.tzhenia.bookLibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Author} class
 */

public interface AuthorRepository extends JpaRepository<Author, Long> {
}







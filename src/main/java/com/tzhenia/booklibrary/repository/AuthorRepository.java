package com.tzhenia.booklibrary.repository;

import com.tzhenia.booklibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Author} class
 */

public interface AuthorRepository extends JpaRepository<Author, Long> {
}







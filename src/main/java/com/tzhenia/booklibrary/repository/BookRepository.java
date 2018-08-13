package com.tzhenia.booklibrary.repository;

import com.tzhenia.booklibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Book} class
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}







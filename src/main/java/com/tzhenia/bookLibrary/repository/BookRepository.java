package com.tzhenia.bookLibrary.repository;

import com.tzhenia.bookLibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Book} class
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}







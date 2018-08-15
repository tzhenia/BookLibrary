package com.tzhenia.bookLibrary.service;

import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.Book;
import com.tzhenia.bookLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link BookService} interface.
 */

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book getById(Long id) {
        log.info("IN BookServiceImpl getById {}", id);
        return bookRepository.findOne(id);
    }

    @Override
    public void save(Book book) {
        log.info("IN BookServiceImpl save {}", book);
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        log.info("IN BookServiceImpl delete {}", id);
        bookRepository.delete(id);
    }

    @Override
    public List<Book> getAll() {
        log.info("IN BookServiceImpl getAll");
        return bookRepository.findAll();
    }
}
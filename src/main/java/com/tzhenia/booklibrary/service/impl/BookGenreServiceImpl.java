package com.tzhenia.booklibrary.service.impl;

import com.tzhenia.booklibrary.model.BookGenre;
import com.tzhenia.booklibrary.repository.BookGenreRepository;
import com.tzhenia.booklibrary.service.BookGenreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link BookGenreService} interface.
 */

@Slf4j
@Service
public class BookGenreServiceImpl implements BookGenreService {

    @Autowired
    BookGenreRepository bookGenreRepository;

    @Override
    public BookGenre getById(Long id) {
        log.info("IN BookGenreServiceImpl getById {}", id);
        return bookGenreRepository.findOne(id);
    }

    @Override
    public List<BookGenre> getAll() {
        log.info("IN BookGenreServiceImpl getAll");
        return bookGenreRepository.findAll();
    }
}
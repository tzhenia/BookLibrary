package com.tzhenia.bookLibrary.service;

import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.AuthorBook;
import com.tzhenia.bookLibrary.repository.AuthorBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link AuthorBookService} interface.
 */

@Slf4j
@Service
public class AuthorBookServiceImpl implements AuthorBookService {

    @Autowired
    AuthorBookRepository authorBookRepository;

    @Override
    public AuthorBook getById(Long id) {
        log.info("IN AuthorBookServiceImpl getById {}", id);
        return authorBookRepository.findOne(id);
    }

    @Override
    public void save(AuthorBook authorBook) {
        log.info("IN AuthorBookServiceImpl save {}", authorBook);
        authorBookRepository.save(authorBook);
    }

    @Override
    public void delete(Long id) {
        log.info("IN AuthorBookServiceImpl delete {}", id);
        authorBookRepository.delete(id);
    }

    @Override
    public List<AuthorBook> getAll() {
        log.info("IN AuthorBookServiceImpl getAll");
        return authorBookRepository.findAll();
    }
}
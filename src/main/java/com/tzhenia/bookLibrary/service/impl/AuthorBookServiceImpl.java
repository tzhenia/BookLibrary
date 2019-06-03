package com.tzhenia.bookLibrary.service.impl;

import com.tzhenia.bookLibrary.model.Author;
import com.tzhenia.bookLibrary.repository.AuthorRepository;
import com.tzhenia.bookLibrary.service.AuthorBookService;
import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.AuthorBook;
import com.tzhenia.bookLibrary.repository.AuthorBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementations of {@link AuthorBookService} interface.
 */

@Slf4j
@Service
public class AuthorBookServiceImpl implements AuthorBookService {

    @Autowired
    AuthorBookRepository authorBookRepository;

    @Autowired
    private AuthorBookService authorBookService;

    @Autowired
    AuthorRepository authorRepository;

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

    @Override
    public HashMap<Long, Integer> calculateBookByAuthor() {
        log.info("IN AuthorBookServiceImpl calculateBooks");

        List<AuthorBook> allRecords = this.authorBookService.getAll();
        HashMap<Long, Integer> uniqueRecords = new HashMap<>();

        if (allRecords.isEmpty()) {
            log.info("There are no authors of books");
            return null;
        }

        for (AuthorBook authorBook : allRecords) {
            Long authorId = authorBook.getAuthor().getId();

            if(uniqueRecords.containsKey(authorId)){
                int countOfBooks = uniqueRecords.get(authorId);
                uniqueRecords.put(authorId, countOfBooks+1);
            }

            else {
                uniqueRecords.put(authorId, 1);
            }
        }

        return uniqueRecords;
    }


    @Override
    public Author findTheBestAuthor() {
        log.info("IN AuthorBookServiceImpl findTheBestAuthor");

        HashMap<Long, Integer> uniqueRecords = calculateBookByAuthor();

        Long theBestAuthor = 0L;
        int bestResult = 0;

        for (Map.Entry<Long, Integer> pair : uniqueRecords.entrySet()) {
            Long key = pair.getKey();
            int value = pair.getValue();

            if (value >= bestResult){
                theBestAuthor = key;
                bestResult = value;
            }
        }

        return authorRepository.findOne(theBestAuthor);
    }
}
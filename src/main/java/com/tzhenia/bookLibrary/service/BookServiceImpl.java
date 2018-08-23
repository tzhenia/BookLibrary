package com.tzhenia.bookLibrary.service;

import com.tzhenia.bookLibrary.model.AuthorBook;
import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.Book;
import com.tzhenia.bookLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.toIntExact;

/**
 * Implementations of {@link BookService} interface.
 */

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    private AuthorBookService authorBookService;

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

    @Override
    public HashMap<String, Integer> calculateBookByGenre() {
        log.info("IN BookServiceImpl calculateBookByGenre");

        HashMap<String, Integer> resultRecords = new HashMap<>();
        List<Book> allRecords = bookRepository.findAll();

        for (Book book : allRecords) {
           String genre = book.getGenre();

            if(resultRecords.containsKey(genre)){
                int countOfGenre = resultRecords.get(genre);
                resultRecords.put(genre, countOfGenre+1);
            }

            else {
                resultRecords.put(genre, 1);
            }
        }
        return resultRecords;
    }

    @Override
    public List<AuthorBook> returnBooks(int count) {
        log.info("IN BookServiceImpl returnBooks");

        List<AuthorBook> allAuthorBooks = authorBookService.getAll();
        List<AuthorBook> allAuthorBooksValid = new ArrayList<>();

        HashMap<Long, Integer> ratingAuthor = authorBookService.calculateBookByAuthor();
        HashMap<Long, Integer> ratingAuthorValid = new HashMap<>();

        for(HashMap.Entry<Long, Integer> pair : ratingAuthor.entrySet())
        {
            Long key = pair.getKey();
            Integer value = pair.getValue();

            if (value > count){
                ratingAuthorValid.put(key, value);
            }

        }


        for(HashMap.Entry<Long, Integer> pair : ratingAuthorValid.entrySet())
        {
            Long key = pair.getKey();
            Integer value = pair.getValue();
        }


        for(AuthorBook pair : allAuthorBooks)
        {

            for(HashMap.Entry<Long, Integer> pairValid : ratingAuthorValid.entrySet())
            {
                Long key = pairValid.getKey();
                if (key.equals(pair.getAuthorId())){
                    allAuthorBooksValid.add(pair);
                }
            }

        }

        return allAuthorBooksValid;
    }
}
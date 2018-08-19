package com.tzhenia.bookLibrary.service;

import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.Author;
import com.tzhenia.bookLibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Implementations of {@link AuthorService} interface.
 */

@Slf4j
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author getById(Long id) {
        log.info("IN AuthorServiceImpl getById {}", id);
        return authorRepository.findOne(id);
    }

    @Override
    public void save(Author author) {
        log.info("IN AuthorServiceImpl save {}", author);
        authorRepository.save(author);
    }

    @Override
    public void delete(Long id) {
        log.info("IN AuthorServiceImpl delete {}", id);
        authorRepository.delete(id);
    }

    @Override
    public List<Author> getAll() {
        log.info("IN AuthorServiceImpl getAll");
        return authorRepository.findAll();
    }

    @Override
    public List<Author> getAllByYear(byte year) throws ParseException {
        log.info("IN AuthorServiceImpl getAllByYear {}", year);

        List<Author> authorList = authorRepository.findAll();
        return findAuthorsOlderThan( authorList, year);
    }


    private static Integer calculateAge(Date birthday) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    private static List<Author> findAuthorsOlderThan(List<Author> authorList, byte year) throws ParseException{
        log.info("IN AuthorServiceImpl findAuthorsOlderThan()");

        for (Iterator<Author> iter = authorList.listIterator(); iter.hasNext(); ) {
            Author a = iter.next();

            String sBorn = a.getBorn();
            Date born = new SimpleDateFormat("yyyy-MM-dd").parse(sBorn);
            int authorAge = calculateAge(born);

            if (authorAge <= year){
                iter.remove();
            }
        }

        return authorList;
    }
}
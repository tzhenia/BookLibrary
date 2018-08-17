package com.tzhenia.bookLibrary.service;

import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.Author;
import com.tzhenia.bookLibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
            for(Author mc : authorList) {
                String sDate1 = mc.getBorn();
                Date authorAge = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
                int age = calculateAge(authorAge);

                if (age <= year){
                    System.out.println(age + " need to delete");
                }

                else {
                    System.out.println(age);
                }

            }

        return authorList;
    }


    private static Integer calculateAge(Date birthday)
    {
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
}
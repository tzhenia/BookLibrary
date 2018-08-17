package com.tzhenia.bookLibrary.rest;

import com.tzhenia.bookLibrary.model.Author;
import com.tzhenia.bookLibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

/**
 * REST controller for {@link Author} connected requests
 */

@RestController
@RequestMapping("/api/v1/authors/")
public class AuthorRestControllerV1 {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Author> getAuthor(@PathVariable("id") Long authorId) {
        if (authorId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Author author = this.authorService.getById(authorId);

        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Author> saveAuthor(@RequestBody @Valid Author author) {
        HttpHeaders headers = new HttpHeaders();

        if (author == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.authorService.save(author);
        return new ResponseEntity<>(author, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Author> updateAuthor(@RequestBody @Valid Author author, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (author == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.authorService.save(author);

        return new ResponseEntity<>(author, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Author> deleteAuthor(@PathVariable("id") Long id) {
        Author author = this.authorService.getById(id);

        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.authorService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = this.authorService.getAll();

        if (authors.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(authors, HttpStatus.OK);
    }


    @RequestMapping(value = "older/than/{year}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Author>> getAllAuthorsByYear(@PathVariable("year") byte year) throws ParseException {
        List<Author> authors = this.authorService.getAllByYear(year);

        if (authors.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(authors, HttpStatus.OK);
    }
}
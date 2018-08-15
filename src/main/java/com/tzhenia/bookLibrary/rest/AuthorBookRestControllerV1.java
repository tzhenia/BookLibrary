package com.tzhenia.bookLibrary.rest;

import com.tzhenia.bookLibrary.model.AuthorBook;
import com.tzhenia.bookLibrary.service.AuthorBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * REST controller for {@link AuthorBook} connected requests
 */

@RestController
@RequestMapping("/api/v1/authorbooks/")
public class AuthorBookRestControllerV1 {

    @Autowired
    private AuthorBookService authorBookService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AuthorBook> getAuthorBook(@PathVariable("id") Long authorBookId) {
        if (authorBookId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        AuthorBook authorBook = this.authorBookService.getById(authorBookId);

        if (authorBook == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(authorBook, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AuthorBook> saveAuthorBook(@RequestBody @Valid AuthorBook authorBook) {
        HttpHeaders headers = new HttpHeaders();

        if (authorBook == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.authorBookService.save(authorBook);
        return new ResponseEntity<>(authorBook, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AuthorBook> updateAuthorBook(@RequestBody @Valid AuthorBook authorBook, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (authorBook == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.authorBookService.save(authorBook);

        return new ResponseEntity<>(authorBook, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AuthorBook> deleteAuthorBook(@PathVariable("id") Long id) {
        AuthorBook authorBook = this.authorBookService.getById(id);

        if (authorBook == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.authorBookService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<AuthorBook>> getAllAuthorBooks() {
        List<AuthorBook> authorBooks = this.authorBookService.getAll();

        if (authorBooks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(authorBooks, HttpStatus.OK);
    }
}
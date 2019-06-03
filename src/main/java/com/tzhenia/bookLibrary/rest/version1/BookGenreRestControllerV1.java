package com.tzhenia.bookLibrary.rest.version1;

import com.tzhenia.bookLibrary.model.BookGenre;
import com.tzhenia.bookLibrary.service.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * REST controller for {@link BookGenre} connected requests
 */

@RestController
@RequestMapping("/api/v1/books/genre/")
public class BookGenreRestControllerV1 {

    @Autowired
    private BookGenreService bookGenreService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BookGenre> getBookGenre(@PathVariable("id") Long bookGenreId) {
        if (bookGenreId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        BookGenre bookGenre = this.bookGenreService.getById(bookGenreId);

        if (bookGenre == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(bookGenre, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BookGenre>> getAllBookGenres() {
        List<BookGenre> bookGenres = this.bookGenreService.getAll();

        if (bookGenres.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(bookGenres, HttpStatus.OK);
    }
}
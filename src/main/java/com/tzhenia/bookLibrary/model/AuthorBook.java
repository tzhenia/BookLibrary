package com.tzhenia.bookLibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents AuthorBook.
 */

@Entity
@Table(name = "author_book")
@Getter
@Setter
@ToString
public class AuthorBook extends BaseEntity {

    @Column(name = "book-id")
    private Long bookId;

    @Column(name = "author-id")
    private Long authorId;
}
package com.tzhenia.bookLibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents Books Genre.
 */

@Entity
@Table(name = "books_genre")
@Getter
@Setter
@ToString
public class BookGenre extends BaseEntity {

    @Column(name = "name")
    private String name;
}

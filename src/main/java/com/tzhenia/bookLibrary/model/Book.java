package com.tzhenia.bookLibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents Books.
 */

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
public class Book extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "published")
    private String published;

    @Column(name = "rating")
    private String rating;
}
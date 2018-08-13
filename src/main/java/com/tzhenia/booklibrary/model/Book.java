package com.tzhenia.booklibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Simple JavaBean domain object that represents Books.
 */

@Entity
@Getter
@Setter
@ToString
public class Book extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "bookGenre_id")
    private BookGenre bookGenre;

    @Column(name = "published")
    private String published;

    @Column(name = "rating")
    private String rating;
}
package com.tzhenia.booklibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Simple JavaBean domain object that represents Books Genre.
 */

@Entity
@Getter
@Setter
@ToString
public class BookGenre extends BaseEntity {

    @Column(name = "name")
    private String name;
}

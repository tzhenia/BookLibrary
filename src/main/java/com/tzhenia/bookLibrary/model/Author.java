package com.tzhenia.bookLibrary.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents Authors.
 */

@Entity
@Table(name = "authors")
@Getter
@Setter
@ToString
public class Author extends BaseEntity  implements Comparable<Author> {

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "born")
    private String born;


    @Override
    public int compareTo(Author u) {
        if (getBorn() == null || u.getBorn() == null) {
            return 0;
        }
        return getBorn().compareTo(u.getBorn());
    }
}
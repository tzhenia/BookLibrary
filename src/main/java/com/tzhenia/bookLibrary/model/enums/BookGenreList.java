package com.tzhenia.bookLibrary.model.enums;

public enum BookGenreList {

    TECHNICAL(1L, "Technical"),
    EDUCATION(2L, "Education"),
    HISTORICAL(3L, "Historical"),
    FANTASY(4L, "Fantasy"),
    CRIME(5L, "Crime"),
    NOVEL(6L, "Novel");

    public Long id;
    public String name;

    BookGenreList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

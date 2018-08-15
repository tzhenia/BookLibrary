CREATE TABLE IF NOT EXISTS books (
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(50)   NOT NULL,
  published  DATE          ,
  genre      VARCHAR(50)   NOT NULL,
  rating     TINYINT(5)    NOT NULL
);


CREATE TABLE IF NOT EXISTS authors (
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(50)   NOT NULL,
  gender     VARCHAR(6)    NOT NULL,
  born       DATE
);


CREATE TABLE IF NOT EXISTS author_book (
  id         BIGINT AUTO_INCREMENT PRIMARY KEY,
  id_books   BIGINT   NOT NULL,
  id_authors BIGINT   NOT NULL
);


# Data structure:
# ● Books (id, name, published, genre, rating)
# ● Authors (id, name, gender, born)
# ● Book-Author (id, book-id, author-id)
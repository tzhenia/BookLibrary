INSERT INTO `book_genre` VALUES (2, 'Education');
INSERT INTO `book_genre` VALUES (3, 'Historical');
INSERT INTO `book_genre` VALUES (4, 'Fantasy');
INSERT INTO `book_genre` VALUES (5, 'Crime');
INSERT INTO `book_genre` VALUES (6, 'Novel');

INSERT INTO `author` VALUES (1, 'Шкляр Василь Миколайович', 'male', '1951-06-10');
INSERT INTO `author` VALUES (2, 'Joshua Bloch', 'male', '1961-07-28');
INSERT INTO `author` VALUES (3, 'Martin Fowler', 'male', null);
INSERT INTO `author` VALUES (4, 'Chad Fowler', 'male', null);
INSERT INTO `author` VALUES (5, 'J. K. Rowling', 'female', '1965-07-31');
INSERT INTO `author` VALUES (6, 'Dan Brown', 'male', '1964-06-22');
INSERT INTO `author` VALUES (7, 'Suzanne Collins', 'female', '1962-08-10');

INSERT INTO `book` VALUES (1, 'Залишенець. Чорний ворон', null, 3, 5);
INSERT INTO `book` VALUES (2, 'Ключ', '1999-01-01', 6, 3);
INSERT INTO `book` VALUES (3, 'Effective Java: Programming Language Guide', '2001-03-02', 1, 6);
INSERT INTO `book` VALUES (4, 'Java Concurrency in Practice', '2006-04-23', 1, 4);
INSERT INTO `book` VALUES (5, 'Java Puzzlers: Traps, Pitfalls, and Corner Cases', '2005-02-02', 1, 4);
INSERT INTO `book` VALUES (6, 'Patterns of Enterprise Application Architecture', '2002-06-25', 1, 3);
INSERT INTO `book` VALUES (7, 'Harry Potter and the Philosophers Stone', '1997-06-26', 4, 5);
INSERT INTO `book` VALUES (8, 'The Passionate Programmer', '1999-09-21', 2, 5);
INSERT INTO `book` VALUES (9, 'The Lost Symbol', null, 5, 4);

INSERT INTO `author_book` VALUES (1, 2, 1);
INSERT INTO `author_book` VALUES (2, 1, 2);
INSERT INTO `author_book` VALUES (3, 2, 3);
INSERT INTO `author_book` VALUES (4, 2, 4);
INSERT INTO `author_book` VALUES (5, 2, 5);
INSERT INTO `author_book` VALUES (6, 3, 6);
INSERT INTO `author_book` VALUES (7, 6, 9);
INSERT INTO `author_book` VALUES (8, 4, 8);
INSERT INTO `author_book` VALUES (9, 5, 7);
INSERT INTO `books` VALUES ('1', 'Залишенець. Чорний ворон', null, 'historical novel', '5');
INSERT INTO `books` VALUES ('2', 'Ключ', '1999-01-01', 'novel', '3');
INSERT INTO `books` VALUES ('3', 'Effective Java: Programming Language Guide', '2001-03-02', 'technical', '5');
INSERT INTO `books` VALUES ('4', 'Java Concurrency in Practice', '2006-04-23', 'technical', '4');
INSERT INTO `books` VALUES ('5', 'Java Puzzlers: Traps, Pitfalls, and Corner Cases', '2005-02-02', 'technical', '4');
INSERT INTO `books` VALUES ('6', 'Patterns of Enterprise Application Architecture', '2002-06-25', 'technical', '3');
INSERT INTO `books` VALUES ('7', 'Harry Potter and the Philosophers Stone', '1997-06-26', 'fantasy', '5');
INSERT INTO `books` VALUES ('8', 'The Passionate Programmer', '1999-09-21', 'education', '5');
INSERT INTO `books` VALUES ('9', 'The Lost Symbol', null, 'crime', '4');

INSERT INTO `books_genre` VALUES ('1', 'Technical');
INSERT INTO `books_genre` VALUES ('2', 'Education');
INSERT INTO `books_genre` VALUES ('3', 'Historical');
INSERT INTO `books_genre` VALUES ('4', 'Fantasy');
INSERT INTO `books_genre` VALUES ('5', 'Crime');
INSERT INTO `books_genre` VALUES ('6', 'Novel');

INSERT INTO `authors` VALUES (1, 'Шкляр Василь Миколайович', 'male', '1951-06-10');
INSERT INTO `authors` VALUES (2, 'Joshua Bloch', 'male', '1961-07-28');
INSERT INTO `authors` VALUES (3, 'Martin Fowler', 'male', null);
INSERT INTO `authors` VALUES (4, 'Chad Fowler', 'male', null);
INSERT INTO `authors` VALUES (5, 'J. K. Rowling', 'female', '1965-07-31');
INSERT INTO `authors` VALUES (6, 'Dan Brown', 'male', '1964-06-22');
INSERT INTO `authors` VALUES (7, 'Suzanne Collins', 'female', '1962-08-10');

INSERT INTO `author_book` VALUES ('1', '1', '1');
INSERT INTO `author_book` VALUES ('2', '2', '1');
INSERT INTO `author_book` VALUES ('3', '3', '2');
INSERT INTO `author_book` VALUES ('4', '4', '2');
INSERT INTO `author_book` VALUES ('5', '5', '2');
INSERT INTO `author_book` VALUES ('6', '6', '3');
INSERT INTO `author_book` VALUES ('7', '9', '6');
INSERT INTO `author_book` VALUES ('8', '8', '4');
INSERT INTO `author_book` VALUES ('9', '7', '5');
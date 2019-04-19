# Book Library
Simple REST API applicaton. Examples of REST queries

Author
-----------------------------------
**To get all authors' list**

GET: http://localhost:9931/api/v1/authors/ 
***

**To get author by ID 1**

GET: http://localhost:9931/api/v1/authors/1
***

**To add a new author**

POST: http://localhost:9931/api/v1/authors/

With body (application/json):
{
    "name": "Yevhenii Taranukha",
    "gender": "male",
    "born": "1993-03-31"
}
***

**To delete author by ID 1**

Delete: http://localhost:9931/api/v1/authors/1
***

**To update author by ID 1**

PUT: http://localhost:9931/api/v1/authors/

With body (application/json):
{
    "id": "1",
    "name": "Yevhenii Taranukha",
    "gender": "male",
    "born": "1993-03-31"
} 

Books
-----------------------------------
**To get all books' list**

GET: http://localhost:9931/api/v1/book/ 
***

**To get book by ID 1**

GET: http://localhost:9931/api/v1/book/1
***

**To add a new book**

POST: http://localhost:9931/api/v1/book/

With body (application/json):
{
    "name": "Thinking In Java 5th Edition",
    "genre": "technical",
    "published": "2000-12-31",
    "rating": "5"
}
***

**To delete book by ID 1**

Delete: http://localhost:9931/api/v1/book/1
***

**To update book by ID 1**

PUT: http://localhost:9931/api/v1/book/

With body (application/json):
{
    "id": "1",
    "name": "Thinking In Java 5th Edition",
    "genre": "technical",
    "published": "2000-12-31",
    "rating": "5"
}

Book Genre
-----------------------------------
**To get all genres of books list**

GET: http://localhost:9931/api/v1/book/genre/ 
***

**To get book genre by ID 1**

GET: http://localhost:9931/api/v1/book/genre/1

AuthorBook
-----------------------------------
**To get all authors of books list**

GET: http://localhost:9931/api/v1/authorbooks/ 
***

**To get author of book by ID 1**

GET: http://localhost:9931/api/v1/authorbooks/1
***

**To add a new author of book**

POST: http://localhost:9931/api/v1/authorbooks/

With body (application/json):
{
        "bookId": 31,
        "authorId": 31
}
***

**To delete author of book by ID 1**

Delete: http://localhost:9931/api/v1/authorbooks/1
***

**To update author of book by ID 1**

PUT: http://localhost:9931/api/v1/authorbooks/

With body (application/json):
{
    "id": "1",
    "bookId": 31,
    "authorId": 31 
}

Search
-----------------------------------

**To get all authors older than ***N*** years**

GET: http://localhost:9931/api/v1/authors/older/than/25
***


**Calculate number of books by genre**

GET: http://localhost:9931/api/v1/books/calculate/number/of/books/by/genre/
***


**Calculate number of books by author**

GET: http://localhost:9931/api/v1/authorbooks/calculate/number/of/books/by/author/
***


**Find out author which has most books**

GET: http://localhost:9931/api/v1/authorbooks/find/out/author/which/has/most/books/
***


**Return books whose author has more than ***N*** written books**

GET: http://localhost:9931/api/v1/books/return/books/whose/author/has/more/than/1/written/books/
***

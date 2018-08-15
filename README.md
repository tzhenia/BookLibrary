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
***

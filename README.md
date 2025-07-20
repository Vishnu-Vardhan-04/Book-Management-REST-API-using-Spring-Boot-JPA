# Book-Management-REST-API-using-Spring-Boot-JPA

Designed and developed a RESTful Book Management API using Spring Boot, Spring Data JPA, and H2 Database. Implemented CRUD operations for books including add, fetch by title, and update functionality. Utilized layered architecture with Controller, Service, Repository, and Entity classes. Leveraged Lombok to reduce boilerplate code and used Postman for endpoint testing. Ensured data persistence using an in-memory H2 database and followed RESTful principles for endpoint design.

Tech Stack:

Java

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Postman

# Key Features:

Create a new book using POST /book/v1/addBook

Retrieve a book by title using GET /book/v1/getBook/{bookName}

Update an existing book using PUT /book/v1/updateBook

Robust error handling and service-layer abstraction

Used JPA repository for database interactions with minimal boilerplate

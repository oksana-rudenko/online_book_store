﻿![img_6.png](img_6.png)

# Online Bookstore

Java-based application providing online service for searching and ordering books.

## Introduction

Time spending with book is never wasted. This application will help to make right choice
according to one's preferences and tastes. It provides all necessary information about books,
suitable searching tools and order management options containing all required security technologies.

## Controllers Functionality

![img_1.png](img_1.png)
![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_5.png](img_5.png)
![img_4.png](img_4.png)

## Database Structure

![img.png](img.png)

## Set Up Instructions

Firstly, for successfully running application, ensure you have installed JDK 17, Maven,
Docker and Postman on your PC.

Clone the repository:

`git clone git@github.com:oksana-rudenko/online-book-store.git`

After that create .env file in root directory and fill it with following data, using your own values
instead of asterisks:

* MYSQLDB_USER=****
* MYSQLDB_PASSWORD=******
* MYSQLDB_DATABASE=******
* MYSQLDB_LOCAL_PORT=****
* MYSQLDB_DOCKER_PORT=****
* SPRING_LOCAL_PORT=****
* SPRING_DOCKER_PORT=****
* DEBUG_PORT=****
* JWT_EXPIRATION_TIME=****
* JWT_SECRET=**************

Build the project:

`mvn clean package`

Build docker-compose:

`docker-compose build`

Run the project:

`docker-compose up`

Try end-points by using Postman (or Swagger).
Start from registration new user or use next credentials as ADMIN:

email: bobSmith@example.com

password: 12345678

## Working with Postman

A few examples of trying project with Postman.
1) Registration process
   ![img_7.png](img_7.png)
2) Login and getting JWT token
   ![img_8.png](img_8.png)
3) Getting all books as authorized user
   ![img_9.png](img_9.png)
4) Searching books by some parameters
   ![img_10.png](img_10.png)

##  Technologies

1. [x] JDK 17
2. [x] Spring Boot v.3.1.4
3. [x] Spring Security 3.1.4
4. [x] Spring Boot Web 3.1.4
5. [x] Spring Boot Data JPA 3.1.4
6. [x] Spring Security Web 3.1.4
7. [x] Testcontainers 1.18.0
8. [x] Liquibase 4.20.0
9. [x] Lombok 0.2.0
10. [x] Mapstruct 1.5.5
11. [x] MySQL 8.0.33
12. [x] H2 Database 2.1.214
13. [x] JJWT 0.11.5
14. [x] Docker 4.26.1.0
15. [x] Maven 3.6.3
16. [x] Swagger
17. [x] Postman
18. [x] Mockito

## Challenges

Making the project as much safe as possible is one of the main challenges of developer.
Bookstore users can be calm about data safety as they are encrypted via BCrypt algorithm,
so passwords in DB are stored in hashing form with using automatically generated salt.
Login operations can be provided by basic authentication and also by bearer token, so
application can be used as stateless.

## Working project video

[Application in using](https://www.loom.com/share/0120d429f8254693a399c55222fc5988)

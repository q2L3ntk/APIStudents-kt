# ![](/doc/icon.png) Student application
> [!WARNING]
> This repository is dedicated. I developed it as prototype fpr a larger project. For more recent releases, see NMAPICore.
## Latest release v0.2.2
- [Download](https://github.com/q2L3ntk/APIStudents-kt/releases/tag/Dedicated)
## How to use this
Application works on Tomcat and can be accessed via the URL adress http://localhost:8080. If you did everything correctly you will see the plug page.
It implements the basic requests: GET, POST, PUT and DELETE. You can use postman to check this out.
The main data manipulation functions are found in the following parts of the URL address:
- /api/v1/students - shows information about existing (or not) students in JSON format
- /api/v1/students/save_student - adds information (as an JSON) about a student
- /api/v1/students/{email} - finds a student by email and outputs in JSON format
- /api/v1/students/update_student - replaces an existing student with a new one
- /api/v1/students/delete_student/{email} - removes existing student

While checking this out in postman you should use this template:
```
{
    "firstName": "firstName",
    "lastName": "lastName",
    "dateOfBirth": "YYYY-MM-DD",
    "email": "email",
}
```
## Security
Since version 0.2.1, only certain authorized users can manipulate student data. Regular users can only view student information. The application is protected from csrf and other attacks.
## PostgreSQL
Using database allows you to store data outside of the application's running time.
Database connection described in application.yml:
```
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/student_db
    username: postgres
    password: renameme
    driver-class-name: org.postgresql.Driver
```
## About
This application was developed using Spring framework version 3.2.11 and using Kotlin language with Gradle project build system. Build and run with Java 21 JDK

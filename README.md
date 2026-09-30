# Library Management System - Java JDBC Web Application

## Stack
Java Servlets, JSP, JDBC, MySQL, Maven, Apache Tomcat 9.

## Setup
1. Create the MySQL database by running `database.sql`.
2. Edit `src/main/java/com/library/util/DBConnection.java` with your MySQL username/password.
3. Run `mvn clean package`.
4. Deploy `target/library-management.war` to Tomcat 9.
5. Open `/library-management/`.

Demo admin:
- Email: admin@library.com
- Password: admin123

This starter project includes login, book management, issue, return, and fine calculation.

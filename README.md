# Spring Boot Application with MySQL 8 and Relationships

This project is a Spring Boot application with MySQL 8 as the database. It demonstrates the implementation of one-to-many relationships between `User` and `Order` entities using JPA.

## Features
- REST API to manage `Users` and `Orders`
- One-to-Many relationship between `User` and `Order`
- MySQL 8 as the database
- CRUD operations for `User` and `Order`
- Proper handling of bi-directional relationships
- JSON serialization with `@JsonManagedReference` and `@JsonBackReference` to prevent infinite recursion

## Prerequisites
- Java 17 or higher
- Maven 3.6+
- MySQL 8.x
- Postman or any API testing tool

## Setup

### 1. Clone the Repository
```bash
https://github.com/Prathamesh-Jagtap/SpringBootJPA-Relationships.git
cd springboot-mysql-relationships
```

# Create a MySQL database for the project:
- CREATE DATABASE myapp;

# Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```
# Test API Endpoints

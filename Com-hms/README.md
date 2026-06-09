# HMS - Healthcare Management System

A comprehensive Healthcare Management System built with Spring Boot and MySQL.

## Features
- User authentication with JWT
- Patient management
- Doctor profiles
- Appointment scheduling
- Medical records
- Prescription management
- Billing system
- Notifications

## Prerequisites
- Java 11+
- MySQL 8.0+
- Maven 3.6+

## Installation

1. Create database:
```sql
CREATE DATABASE hms_db;
```

2. Update `application.properties` with your database credentials

3. Build and run:
```bash
mvn clean install
mvn spring-boot:run
```

API runs on: http://localhost:8080/api

## Technology Stack
- Spring Boot 2.7.14
- MySQL 8.0
- Spring Security + JWT
- JPA Hibernate
- Maven


# Invoice Management System

## Overview
The Invoice Management System is a Spring Boot backend application used to manage customers, products, invoices, and invoice items efficiently using REST APIs and CRUD operations.

This project demonstrates Spring Boot development, layered architecture, and database integration using Spring Data JPA.

---

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven
- REST API
- Postman

---

## Features
- Customer Management (Create, Read, Update, Delete)
- Product Management
- Invoice Creation and Management
- Invoice Item Management
- RESTful APIs
- Exception Handling
- Layered Architecture

---

## Project Structure
```
ims
 ├── controller
 ├── service
 ├── serviceimpl
 ├── repository
 ├── entity
 └── ImsApplication.java
```

---

## Base URL
```
http://localhost:8080/api
```

---

## Customer APIs

| Method | Endpoint | Description |
|-------|----------|-------------|
| POST | /api/customers | Create new customer |
| GET | /api/customers | Get all customers |
| GET | /api/customers/{id} | Get customer by ID |
| PUT | /api/customers/{id} | Update customer |
| DELETE | /api/customers/{id} | Delete customer |

---

## Product APIs

| Method | Endpoint | Description |
|-------|----------|-------------|
| POST | /api/products | Create new product |
| GET | /api/products | Get all products |
| GET | /api/products/{id} | Get product by ID |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

---

## Invoice APIs

| Method | Endpoint | Description |
|-------|----------|-------------|
| POST | /api/invoices | Create invoice |
| GET | /api/invoices | Get all invoices |
| GET | /api/invoices/{id} | Get invoice by ID |
| DELETE | /api/invoices/{id} | Delete invoice |

---

## How to Run

1. Clone the repository
2. Open project in Spring Tool Suite or IntelliJ
3. Configure database in application.properties
4. Run ImsApplication.java
5. Test APIs using Postman

---

## Future Enhancements
- Spring Security
- PDF generation
- Payment integration
- Reporting dashboard

---

## Author
Parvati
Java Full Stack Developer

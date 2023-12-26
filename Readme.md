# Student Management REST API

This is a simple Spring Boot application that provides a RESTful API for managing student information. It includes basic CRUD operations to interact with a database containing student records.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)


## Features

- **Create:** Add new student records to the database.
- **Read:** Retrieve information about all students or a specific student by ID.
- **Update:** Modify existing student records.
- **Delete:** Remove a student record from the database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (you can customize the database configuration based on your requirements)
- Maven (for dependency management)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed (version 21.0.1 or higher)
- Maven installed (version 3.9.6 or higher)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/Md-Azam-Ansari/student-management-spring.git
    cd student-management-spring
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    java -jar target/student-management-spring.jar
    ```

## Usage

Once the application is running, you can use tools like [Postman](https://www.postman.com/) or `curl` to interact with the API. The API will be available at `http://localhost:8080`.

## Endpoints

- **GET /students**: Retrieve a list of all students.
- **GET /students/{id}**: Retrieve information about a specific student by ID.
- **POST /student/add**: Create a new student.
- **PUT /student/update/{id}**: Update an existing student.
- **DELETE /student/remove/{id}**: Remove a student from the database.



# 📚 Bookstore API

A simple RESTful API for managing a bookstore. Built using **Java Spring Boot**, **MySQL**, and **Spring Security**.

---

## 🚀 Tech Stack

- **Backend:** Java, Spring Boot  
- **Database:** MySQL  
- **Security:** Spring Security (Basic Auth)

---

## 📁 Project Structure

```
bookstore-api/
├── src/
│   ├── main/
│   │   ├── java/com/bookstore/
│   │   │   ├── controller/
│   │   │   ├── repository/
│   │   │   └── BookstoreApiApplication.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## 🔐 Security

- **Basic Authentication** using Spring Security.
- Secure endpoints by roles if needed (e.g., `ADMIN`, `USER`).

---

## 📦 Features

- Add, update, delete, and view books
- Secure endpoints with basic auth
- Persistent storage with MySQL

---

## 🛠️ Setup Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL

### Steps

1. **Clone the repo:**
   ```bash
   git clone https://github.com/yourusername/bookstore-api.git
   cd bookstore-api
   ```

2. **Update database settings** in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
   spring.datasource.username=your_mysql_user
   spring.datasource.password=your_mysql_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **API is live at:** `http://localhost:8080`

---

## 📫 API Endpoints (Sample)

| Method | Endpoint           | Description       |
|--------|--------------------|-------------------|
| GET    | `/api/books`       | List all books    |
| POST   | `/api/books`       | Add a new book    |
| PUT    | `/api/books/{id}`  | Update a book     |
| DELETE | `/api/books/{id}`  | Delete a book     |

> 🔐 Secured endpoints require Basic Auth headers.

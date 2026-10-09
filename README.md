# Cricketer Records REST API

A backend application built with **Spring Boot** to manage cricketer records.  
This project demonstrates CRUD operations, layered architecture, and database persistence using **Spring Data JPA** and **MySQL**.  
APIs were tested using **Postman**.

---

## 🚀 Features
- Create, Read, Update, Delete (CRUD) operations
- Partial updates with `PATCH` requests
- Layered architecture: Controller, Service, Repository, Model
- Custom query method: `findByName`
- Lombok annotations (`@Getter`, `@Setter`) to reduce boilerplate code
- Robust error handling with `orElseThrow()`

---

## 🛠 Tech Stack
- **Java**
- **Spring Boot**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Lombok**
- **Postman** (for API testing)

---

## 📌 API Endpoints

| Method   | Endpoint                                | Description                |
|----------|-----------------------------------------|----------------------------|
| `GET`    | `/cricket/wel`                          | Welcome message            |
| `POST`   | `/cricket/cric`                         | Add new cricketer          |
| `GET`    | `/cricket/getAllCricketers`             | Retrieve all cricketers    |
| `GET`    | `/cricket/GetCricketerById/{cid}`       | Get cricketer by ID        |
| `GET`    | `/cricket/GetCricketerByName/{name}`    | Get cricketer by name      |
| `PUT`    | `/cricket/UpdateCrickterid/{cid}`       | Update cricketer (full)    |
| `PATCH`  | `/cricket/UpdateCrickterid/{cid}`       | Partially update cricketer |
| `DELETE` | `/cricket/DeleteCrickterid/{cid}`       | Delete cricketer           |

---

## ⚙️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/springboot-cricketer-records-api.git

🛒 E-Commerce Backend Application

This is a Spring Boot–based E-commerce Backend Application that provides REST APIs for managing users, products, categories, carts, orders, and payments.
The project follows industry-standard layered architecture and is designed for scalability and security.

🚀 Tech Stack

Java 21

Spring Boot

Spring Data JPA (Hibernate)

Spring Security (JWT Authentication)

MySQL

Maven

Stripe Payment Gateway

📁 Project Structure
src/main/java
 ├── controller      # REST Controllers
 ├── service         # Business logic interfaces
 ├── serviceImpl     # Business logic implementations
 ├── repository      # JPA Repositories
 ├── model           # Entity classes
 ├── security        # JWT, filters, security config
 └── dto             # Data Transfer Objects

src/main/resources
 └── application.properties
🔐 Features

User Registration & Login

JWT-based Authentication & Authorization

Role-based access (USER / ADMIN)

Product & Category Management

Cart & Order APIs

Secure REST APIs

Stripe Payment Integration

Validation & Exception Handling

🔑 Authentication Flow (JWT)

User logs in with username & password

Server generates JWT token

Client sends token in Authorization header

Spring Security filter validates token

Access granted based on role

🗄️ Database Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
💳 Stripe Configuration
stripe.secret.key=sk_test_xxxxxxxxxxxxx

Used for:

Creating payment intent

Secure online payments

▶️ How to Run the Project

Clone the repository

git clone https://github.com/Adikumetha/ecommerce-backend-project.git

Open in IntelliJ IDEA

Configure database & Stripe key

Run:

mvn spring-boot:run

Server runs on:

http://localhost:8080
📌 API Testing

You can test APIs using:

Postman

Swagger (if enabled)

Example:

POST /api/auth/login
GET  /api/products
POST /api/cart/add
🧠 Learning Outcomes

Real-world Spring Boot project structure

JWT security implementation

REST API design

Database relationships (JPA)

Payment gateway integration

👨‍💻 Author

Adikeshava Kumetha
Java Backend Developer

📄 License

This project is licensed under the MIT License.

# Inventory API

A RESTful API for inventory management built with Java and Spring Boot.

Inspired by real-world experience in automotive manufacturing, where tracking
parts and materials was a critical daily operation.

## Technologies

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Maven

## Getting Started

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `InventoryApiApplication.java`
4. API will be available at `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | List all products |
| GET | /api/products/{id} | Get product by ID |
| POST | /api/products | Create new product |
| PUT | /api/products/{id} | Update product |
| DELETE | /api/products/{id} | Delete product |

## Sample Request
```json
POST /api/products
{
    "name": "Çelik Vida M8",
    "category": "Hammadde",
    "quantity": 500,
    "price": 2.50
}
```
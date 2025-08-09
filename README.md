# JakartaValidation

A Spring Boot 3.5.4 demo project showcasing **Jakarta Bean Validation** with validation groups.
It demonstrates how to apply different validation rules for various card types (Visa, MasterCard, UzCard, Processing).

## Features

- REST API with Spring Boot 3
- Jakarta Bean Validation (`jakarta.validation`)
- Validation groups for different card types
- Java 21 support
- Maven build

## Technologies

- **Java 21**
- **Jakarta Validation**

## Project Structure

```
src/main/java/uz/nodir/jakartavalidation/
├── controller/         # REST controllers
├── dto/
│   └── card/
│       ├── group/      # Validation groups
│       └── request/    # DTOs for requests
└── JakartaValidationApplication.java
```

## API

### POST `/cards/visa`
Validate Visa card request.

### POST `/cards/master`
Validate MasterCard request.

### POST `/cards/uzcard`
Validate UzCard request.

### Request Example

```json
POST /cards/visa
Content-Type: application/json

{
  "card": "8600123412341234",
  "expiry": "12/26",
  "cvv": "123"
}
```

### Response Example (Validation Error)

```json
{
  "errors": [
    "Card field is required",
    "Expiry date format is invalid"
  ]
}
```

## Installation

```bash
git clone https://github.com/yourusername/JakartaValidation.git
cd JakartaValidation
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

The app will start on **http://localhost:8080**



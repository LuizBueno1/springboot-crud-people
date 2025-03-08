# Spring Boot API - People Management

This project is a powerful and efficient REST API built using Spring Boot. It is designed to handle the management of people in a structured database, enabling smooth CRUD (Create, Read, Update, Delete) operations. The API follows best practices to ensure reliability, scalability, and maintainability.

## ✨ What This Project Does
- Provides a structured way to **register new people** in the database.
- Allows **retrieving a list of all registered people** with ease.
- Enables **searching for a specific person by their unique ID**.
- Supports **updating a person's information**, ensuring data accuracy.
- Offers **deletion of records**, keeping the database clean and organized.
- Includes **advanced search and filtering options**, such as ordering by name, filtering by specific criteria, and summing up total ages.

## 🚀 How It Works
1. **A user sends a request** to create, retrieve, update, or delete a person.
2. **The API processes the request**, ensuring data validation and consistency.
3. **The database is updated** or queried based on the request type.
4. **A response is returned**, confirming the success or failure of the operation.

## 📖 Endpoints
- `POST /api` → Register a new person.
- `GET /api` → Retrieve all registered people.
- `GET /api/{id}` → Fetch a person by their ID.
- `PUT /api` → Update an existing person's details.
- `DELETE /api/{id}` → Remove a person from the database.
- `GET /api/counter` → Get the total number of registered people.
- `GET /api/orderNames` → Retrieve people ordered by name.
- `GET /api/orderNames2` → Retrieve people ordered by name and age.
- `GET /api/nameContain` → Find people whose names contain a specific letter.
- `GET /api/startsWith` → Find people whose names start with a specific letter.
- `GET /api/endsWith` → Find people whose names end with a specific letter.
- `GET /api/sumAges` → Get the sum of all registered ages.
- `GET /api/findByAgeGreaterOrEqual` → Find people above a certain age.
- `GET /` → Return "Hello World!" as a simple response.
- `GET /welcome/{name}` → Return a welcome message with the given name.
- `GET /welcome` → Return a general welcome message.
- `POST /person` → Receive and return a person object.
- `GET /status` → Return HTTP status **201 Created**.
- `POST /client` → Receive and validate a client object.




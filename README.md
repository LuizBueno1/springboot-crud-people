# Spring Boot API - People Management

A REST API built using Spring Boot for structured people management in a database environment. The API implements comprehensive CRUD operations while adhering to established development practices for reliability, scalability, and maintainability.

## Functionality

The system provides comprehensive people management capabilities through the following operations:

- Registration of new people in the database
- Retrieval of all registered people records
- Search functionality for specific individuals by unique ID
- Update operations for existing person information to ensure data accuracy
- Record deletion capabilities for database maintenance
- Advanced search and filtering options including ordering by name, filtering by specific criteria, and summing total ages

## System Operation

1. User submits requests for create, retrieve, update, or delete operations
2. API processes requests with data validation and consistency checks
3. Database operations are executed based on request type
4. Response confirmation is returned indicating operation success or failure

## API Endpoints

### Core CRUD Operations
- `POST /api` → Register a new person
- `GET /api` → Retrieve all registered people
- `GET /api/{id}` → Fetch a person by their ID
- `PUT /api` → Update an existing person's details
- `DELETE /api/{id}` → Remove a person from the database

### Advanced Operations
- `GET /api/counter` → Get the total number of registered people
- `GET /api/orderNames` → Retrieve people ordered by name
- `GET /api/orderNames2` → Retrieve people ordered by name and age
- `GET /api/nameContain` → Find people whose names contain a specific letter
- `GET /api/startsWith` → Find people whose names start with a specific letter
- `GET /api/endsWith` → Find people whose names end with a specific letter
- `GET /api/sumAges` → Get the sum of all registered ages
- `GET /api/findByAgeGreaterOrEqual` → Find people above a certain age

### Utility Endpoints
- `GET /` → Return "Hello World!" as a simple response
- `GET /welcome/{name}` → Return a welcome message with the given name
- `GET /welcome` → Return a general welcome message
- `POST /person` → Receive and return a person object
- `GET /status` → Return HTTP status 201 Created
- `POST /client` → Receive and validate a client object

# E-Challan-Mangangement-with-Spring-Boot
Features

Owner Management: Register and manage vehicle owners with license details
Vehicle Registration: Track multiple vehicles per owner with complete vehicle information
Challan Generation: Create and manage traffic violation records (challans)
Fine Calculation: Automated fine tracking and total calculation per owner/vehicle
Relationship Management: Seamless handling of one-to-many relationships between owners, vehicles, and challans
RESTful APIs: Complete CRUD operations for all entities
Data Persistence: MySQL database integration with JPA/Hibernate

🛠️ Technology Stack

Backend: Spring Boot, Spring Data JPA
Database: MySQL
ORM: Hibernate
Build Tool: Maven
Language: Java 8+
Architecture: RESTful API, MVC Pattern

📊 Database Schema

Owner: License details, contact information
Vehicle: Registration number, brand, model, color
Challan: Violation type, location, fine amount, timestamps

🔗 Key Relationships

One Owner → Many Vehicles
One Owner → Many Challans
One Vehicle → Many Challans

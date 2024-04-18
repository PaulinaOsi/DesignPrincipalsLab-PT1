# Design Principles Lab - Part 1

This repository hosts Part 1 of a 2-part series focusing on implementing solid design principles in Java. It contains examples and code implementations that illustrate best practices in software design to enhance maintainability and scalability.

## Purpose

The aim of this project is to showcase the practical application of various design principles. This first part focuses on foundational concepts such as the Single Responsibility Principle (SRP) and the Open/Closed Principle (OCP), providing clear examples of how these can be incorporated into Java programming.

## Technologies and Packages Used

- **Java**: The main programming language used for demonstrating design principles.
- **JUnit**: Employed for unit testing to verify the functionality and integrity of the code.
- **Maven**: Manages dependencies and facilitates project builds.
- **Jackson**: Utilized for JSON processing, demonstrating practical use in user management scenarios.

## Project Structure

- `Subscriber.java`, `ISPSubscriber.java`, `PhoneSubscriber.java`: These classes exemplify the Open/Closed Principle by extending the base `Subscriber` class. Each class adapts or extends the functionality without modifying the original code base.
- `Store.java`, `User.java`, `UserController.java`, `UserStorage.java`, `UserValidation.java`: These files demonstrate the Single Responsibility Principle by separating concerns into distinct classes, each handling a specific aspect of user management.

### Key Components:

- **Single Responsibility Principle (SRP)**: Demonstrated through the `UserStorage` and `UserValidation` classes, which handle data storage and user validation, respectively.
- **Open/Closed Principle (OCP)**: Showcased in the subscriber classes where new functionalities are added via subclasses without altering existing code.

## Running the Project

To run and test the implementations in this project, follow these steps:

1. Ensure Java and Maven are installed on your system.
2. Clone the repository to your local machine.
3. Navigate to the project directory.
4. Execute the following Maven command to compile the project and run tests:
   ```bash
   mvn clean install

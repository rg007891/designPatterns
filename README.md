# Design Patterns in Java

This repository contains Java implementations of various design patterns, including Singleton, Builder, and Prototype. Each pattern is demonstrated with code examples to help understand its structure and usage.

## Design Patterns Included

### Singleton Pattern
The Singleton pattern ensures a class has only one instance and provides a global point of access to it. This repository includes three versions of the Singleton pattern:
1. **Single-threaded Singleton**: A basic implementation suitable for single-threaded environments.
2. **Multithreaded Singleton (Eager Initialization)**: This approach initializes the instance at the time of class loading, ensuring thread safety.
3. **Multithreaded Singleton (Lazy Initialization)**: This approach initializes the instance when it is first requested, with additional logic to ensure thread safety.

### Builder Pattern
The Builder pattern is used to construct complex objects step by step. It allows for more control over the construction process and can produce different representations of an object using the same building process.

### Prototype Pattern
The Prototype pattern is used to create new objects by copying an existing object, known as the prototype. This approach is useful when the cost of creating a new object is high.

<h3>Contributions</h3>

<p>Contributions are welcome! If you have suggestions or improvements, feel free to fork the repository and submit a pull request.</p>

<h3>License</h3>

<p>This project is licensed under freeware. You are free to use, modify, and distribute the software with no additional restrictions.</p>

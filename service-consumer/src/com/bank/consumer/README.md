# Service Consumer Module

## Purpose

The **Service Consumer** module serves as the main entry point for the banking application. It consumes services provided by other modules, such as the `customer-module` for retrieving customer details and the `fraud-detection-module` for detecting fraud.

This module demonstrates how to:

- Use the `requires` keyword to declare dependencies on other modules.
- Use the `uses` keyword to consume services provided by other modules dynamically (e.g., fraud detection).

## Main Class

- **Main.java**: The entry point of the application where services from other modules are consumed.

## Module Info

- The `module-info.java` file declares dependencies on `customer-module` and `fraud-detection-module`.

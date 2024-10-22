# Customer Module

## Purpose

The **Customer Module** manages customer-related information. It contains classes and logic for handling customer details, such as their name, age, and other personal data.

This module demonstrates:

- The use of `exports` to expose public APIs (like `Customer`) to other modules.
- The use of `exports ... to` to restrict access to certain parts of the module.

## Main Class

- **Customer.java**: This class contains the logic for displaying customer details.

## Module Info

- The `module-info.java` file exports the `com.bank.customer` package to make customer details available to other modules like `service-consumer`.

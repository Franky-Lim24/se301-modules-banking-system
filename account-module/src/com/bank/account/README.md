# Account Module

## Purpose

The **Account Module** manages bank accounts and their related transactions. It also demonstrates how to access sensitive customer data using reflection.

This module demonstrates:

- Using `requires` to declare dependencies on the `customer-module`.
- The `opens ... to` directive to control which modules have reflective access to sensitive customer data.

## Main Class

- **AccountManager.java**: This class manages accounts and demonstrates the use of reflection to access private customer information.

## Module Info

- The `module-info.java` file declares a dependency on the `customer-module` and uses `opens` to allow the `Account Module` to access sensitive customer data via reflection.

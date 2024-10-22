# Fraud Detection Module

## Purpose

The **Fraud Detection Module** integrates a third-party fraud detection service. It provides a service implementation of `FraudDetectionService` that can be consumed by other modules (like `service-consumer`).

This module demonstrates:

- How to provide a service using the `provides ... with` directive.
- How to implement a service interface (SPI) that can be consumed dynamically by other modules.

## Main Class

- **FraudDetectionService.java**: The interface for the fraud detection service.
- **FraudDetectionServiceImpl.java**: The implementation of the fraud detection service.

## Module Info

- The `module-info.java` file exports the `com.bank.fraud` package and provides the `FraudDetectionService` implementation to the `service-consumer`.

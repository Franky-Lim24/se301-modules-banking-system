# Modular Banking System

## Overview

This is a multi-module Java 9 project demonstrating the Java Platform Module System (JPMS). The system consists of several modules that simulate a banking application. The project showcases modular programming concepts such as `requires`, `exports`, `provides`, `uses`, `opens`, and reflective access using Java 9 modules.

### Project Modules

1. **Service Consumer Module**: The main entry point of the application that consumes services from other modules.
2. **Customer Module**: Manages customer details and restricts access to private customer information.
3. **Account Module**: Manages bank accounts and uses reflection to access sensitive data.
4. **Fraud Detection Module**: Provides fraud detection as a service using the Service Provider Interface (SPI) mechanism.

### Key Concepts Demonstrated:

- **`requires`**: Declares dependencies between modules.
- **`requires transitive`**: Propagates module dependencies.
- **`exports`**: Exposes specific packages to other modules.
- **`provides ... with`**: Provides a service implementation for use by other modules.
- **`uses`**: Dynamically consumes services provided by other modules.
- **`opens ... to`**: Allows reflective access to specific modules.

### How to Compile and Run the Project

#### 1. Compile All Modules

From the root directory of the project, run:

```bash
javac -d out --module-source-path . $(find . -name "*.java")
```

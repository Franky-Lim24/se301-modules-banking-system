package com.bank.consumer;

// For Practice 1
// import com.bank.customer.Customer;

// public class Main {
// public static void main(String[] args) {
// System.out.println("Welcome to the Bank Service Consumer!");
// Customer customer = new Customer();
// customer.displayCustomerDetails();
// }
// }


// For Practice 3
// import com.bank.fraud.FraudDetectionService;
// import java.util.ServiceLoader;

// public class Main {
// public static void main(String[] args) {
// System.out.println("Welcome to the Bank Service Consumer!");
// ServiceLoader<FraudDetectionService> loader =
// ServiceLoader.load(FraudDetectionService.class);
// FraudDetectionService service = loader.findFirst().orElseThrow();
// service.detectFraud();
// }
// }


// For Practice 4
// import com.bank.fraud.FraudDetectionService;
// import com.bank.account.AccountManager; // Importing AccountManager to test reflection

// import java.util.ServiceLoader;

// public class Main {
// public static void main(String[] args) {
// System.out.println("Welcome to the Bank Service Consumer!");

// // Step 1: Use Fraud Detection Service
// ServiceLoader<FraudDetectionService> loader =
// ServiceLoader.load(FraudDetectionService.class);
// FraudDetectionService service = loader.findFirst().orElseThrow();
// service.detectFraud();

// // Step 2: Test AccountManager's reflection access to SensitiveCustomerData
// System.out.println(
// "Testing reflection access to sensitive customer data via AccountManager:");
// AccountManager manager = new AccountManager();
// manager.accessSensitiveData(); // Call the method to test reflection
// }
// }

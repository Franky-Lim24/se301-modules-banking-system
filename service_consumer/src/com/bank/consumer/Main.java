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
import com.bank.fraud.FraudDetectionService;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Service Consumer!");
        // ServiceLoader<FraudDetectionService> loader =
        // ServiceLoader.load(FraudDetectionService.class);
        // FraudDetectionService service = loader.findFirst().orElseThrow();
        // service.detectFraud();
    }
}

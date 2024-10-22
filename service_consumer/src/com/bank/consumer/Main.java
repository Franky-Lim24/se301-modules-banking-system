package com.bank.consumer;

import com.bank.customer.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Service Consumer!");
        Customer customer = new Customer();
        customer.displayCustomerDetails();
    }
}

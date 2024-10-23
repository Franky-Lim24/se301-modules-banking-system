module customer_module {
  exports com.bank.customer;

  opens com.bank.customer to account_module;
}

module service_consumer {
  requires customer_module;
  requires fraud_detection_module;
  requires account_module;
  uses com.bank.fraud.FraudDetectionService;
}

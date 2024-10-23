module fraud_detection_module {
  exports com.bank.fraud;

  provides com.bank.fraud.FraudDetectionService with com.bank.fraud.FraudDetectionServiceImpl;
}

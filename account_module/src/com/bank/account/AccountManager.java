package com.bank.account;

import com.bank.customer.SensitiveCustomerData;

import java.lang.reflect.Field;

public class AccountManager {
  public void accessSensitiveData() {
    try {
      SensitiveCustomerData data = new SensitiveCustomerData();
      Field field = SensitiveCustomerData.class.getDeclaredField("encryptedDetails");
      field.setAccessible(true);
      System.out.println("Accessing Sensitive Data: " + field.get(data));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

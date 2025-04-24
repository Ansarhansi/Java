package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    public void processPayment() {
        System.out.println("Payment processed successfully.");
    }
}

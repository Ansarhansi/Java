package com.ansar.interfaces.internal;

public interface OrderProcessingSystem {
    void placeOrder();
    void cancelOrder();
    void trackOrder();
    void updateOrder();
    void applyDiscount();
    void processPayment();
    void refundOrder();
    void generateInvoice();
    void confirmDelivery();
}


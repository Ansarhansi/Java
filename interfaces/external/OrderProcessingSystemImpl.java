package com.ansar.interfaces.external;


import com.ansar.interfaces.internal.OrderProcessingSystem;

public class OrderProcessingSystemImpl implements OrderProcessingSystem {
    @Override
    public void placeOrder() {
        System.out.println("Placing order...");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Canceling order...");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order...");
    }

    @Override
    public void updateOrder() {
        System.out.println("Updating order...");
    }

    @Override
    public void applyDiscount() {
        System.out.println("Applying discount...");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @Override
    public void refundOrder() {
        System.out.println("Refunding order...");
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }

    @Override
    public void confirmDelivery() {
        System.out.println("Confirming delivery...");
    }
}

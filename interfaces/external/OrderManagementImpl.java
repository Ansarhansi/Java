package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.OrderManagement;

// Implementation: OrderManagementImpl.java
public class OrderManagementImpl implements OrderManagement {
    @Override
    public void createOrder() {
        System.out.println("Creating order...");
    }

    @Override
    public void updateOrder() {
        System.out.println("Updating order...");
    }

    @Override
    public void deleteOrder() {
        System.out.println("Deleting order...");
    }

    @Override
    public void viewOrder() {
        System.out.println("Viewing order...");
    }

    @Override
    public void processOrder() {
        System.out.println("Processing order...");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Canceling order...");
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }
}

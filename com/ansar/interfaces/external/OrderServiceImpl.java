package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.OrderService;

public class OrderServiceImpl implements OrderService {
    public void createOrder() {
        System.out.println("Order created.");
    }
    public void updateOrder() {
        System.out.println("Order updated.");
    }
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}


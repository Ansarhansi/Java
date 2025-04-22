package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.ProductManagementSystem;

public class ProductManagementSystemImpl implements ProductManagementSystem {
    @Override
    public void addNewProduct() {
        System.out.println("Adding new product...");
    }

    @Override
    public void removeProduct() {
        System.out.println("Removing product...");
    }

    @Override
    public void updateProductDetails() {
        System.out.println("Updating product details...");
    }

    @Override
    public void viewProduct() {
        System.out.println("Viewing product...");
    }

    @Override
    public void checkProductAvailability() {
        System.out.println("Checking product availability...");
    }

    @Override
    public void restockProduct() {
        System.out.println("Restocking product...");
    }

    @Override
    public void generateProductReport() {
        System.out.println("Generating product report...");
    }
}

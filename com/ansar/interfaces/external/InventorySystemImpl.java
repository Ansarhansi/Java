package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.InventorySystem;

public class InventorySystemImpl implements InventorySystem {
    @Override
    public void addItem() {
        System.out.println("Adding item to inventory...");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing item from inventory...");
    }

    @Override
    public void updateItem() {
        System.out.println("Updating item in inventory...");
    }

    @Override
    public void viewItem() {
        System.out.println("Viewing item details...");
    }

    @Override
    public void checkStock() {
        System.out.println("Checking stock...");
    }

    @Override
    public void reorderItem() {
        System.out.println("Reordering item...");
    }

    @Override
    public void generateStockReport() {
        System.out.println("Generating stock report...");
    }
}
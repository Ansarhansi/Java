package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.InventoryService;

public class InventoryServiceImpl implements InventoryService {
    public void addItem() {
        System.out.println("Item added to inventory.");
    }
    public void updateItem() {
        System.out.println("Inventory item updated.");
    }
    public void removeItem() {
        System.out.println("Item removed from inventory.");
    }
}

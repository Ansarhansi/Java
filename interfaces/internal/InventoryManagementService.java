package com.ansar.interfaces.internal;

public interface InventoryManagementService {
    void addInventoryItem();
    void removeInventoryItem();
    void updateInventoryItem();
    void checkItemStock();
    void generateInventoryReport();
    void reorderStock();
    void trackInventoryValue();
}

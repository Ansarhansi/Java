package com.ansar.interfaces.internal;

public interface InventoryTrackingSystem {
    void trackInventoryLevel();
    void updateInventory();
    void generateInventoryReport();
    void setReorderThreshold();
    void checkExpirationDate();
    void transferInventory();
    void performInventoryAudit();
}
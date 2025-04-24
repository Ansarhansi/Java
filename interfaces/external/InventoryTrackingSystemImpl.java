package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.InventoryTrackingSystem;

public class InventoryTrackingSystemImpl implements InventoryTrackingSystem {
    @Override
    public void trackInventoryLevel() {
        System.out.println("Tracking inventory level...");
    }

    @Override
    public void updateInventory() {
        System.out.println("Updating inventory...");
    }

    @Override
    public void generateInventoryReport() {
        System.out.println("Generating inventory report...");
    }

    @Override
    public void setReorderThreshold() {
        System.out.println("Setting reorder threshold...");
    }

    @Override
    public void checkExpirationDate() {
        System.out.println("Checking expiration date...");
    }

    @Override
    public void transferInventory() {
        System.out.println("Transferring inventory...");
    }

    @Override
    public void performInventoryAudit() {
        System.out.println("Performing inventory audit...");
    }
}


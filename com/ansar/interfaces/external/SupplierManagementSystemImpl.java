package com.ansar.interfaces.external;


import com.ansar.interfaces.internal.SupplierManagementSystem;

public class SupplierManagementSystemImpl implements SupplierManagementSystem {
    @Override
    public void addNewSupplier() {
        System.out.println("Adding new supplier...");
    }

    @Override
    public void updateSupplierDetails() {
        System.out.println("Updating supplier details...");
    }

    @Override
    public void removeSupplier() {
        System.out.println("Removing supplier...");
    }

    @Override
    public void trackSupplierPerformance() {
        System.out.println("Tracking supplier performance...");
    }

    @Override
    public void processSupplierPayment() {
        System.out.println("Processing supplier payment...");
    }

    @Override
    public void viewSupplierHistory() {
        System.out.println("Viewing supplier history...");
    }

    @Override
    public void generateSupplierReport() {
        System.out.println("Generating supplier report...");
    }
}


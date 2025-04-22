package com.ansar.interfaces.external;


import com.ansar.interfaces.internal.SalesTrackingSystem;

public class SalesTrackingSystemImpl implements SalesTrackingSystem {
    @Override
    public void recordSale() {
        System.out.println("Recording sale...");
    }

    @Override
    public void updateSale() {
        System.out.println("Updating sale...");
    }

    @Override
    public void cancelSale() {
        System.out.println("Canceling sale...");
    }

    @Override
    public void viewSalesReport() {
        System.out.println("Viewing sales report...");
    }

    @Override
    public void calculateSalesCommission() {
        System.out.println("Calculating sales commission...");
    }

    @Override
    public void trackRevenue() {
        System.out.println("Tracking revenue...");
    }

    @Override
    public void analyzeSalesTrends() {
        System.out.println("Analyzing sales trends...");
    }
}


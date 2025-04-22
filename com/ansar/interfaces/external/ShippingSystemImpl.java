package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.ShippingSystem;

public class ShippingSystemImpl implements ShippingSystem {
    @Override
    public void scheduleShipment() {
        System.out.println("Scheduling shipment...");
    }

    @Override
    public void trackShipment() {
        System.out.println("Tracking shipment...");
    }

    @Override
    public void updateShipmentStatus() {
        System.out.println("Updating shipment status...");
    }

    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating shipping cost...");
    }

    @Override
    public void processReturn() {
        System.out.println("Processing return...");
    }

    @Override
    public void packageItem() {
        System.out.println("Packaging item...");
    }

    @Override
    public void dispatchShipment() {
        System.out.println("Dispatching shipment...");
    }

    @Override
    public void generateShippingLabel() {
        System.out.println("Generating shipping label...");
    }

    @Override
    public void confirmShipment() {
        System.out.println("Confirming shipment...");
    }
}

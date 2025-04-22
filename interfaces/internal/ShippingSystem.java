package com.ansar.interfaces.internal;

public interface ShippingSystem {
    void scheduleShipment();
    void trackShipment();
    void updateShipmentStatus();
    void calculateShippingCost();
    void processReturn();
    void packageItem();
    void dispatchShipment();
    void generateShippingLabel();
    void confirmShipment();
}
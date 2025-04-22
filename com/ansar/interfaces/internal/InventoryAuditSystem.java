package com.ansar.interfaces.internal;

public interface InventoryAuditSystem {
    void startInventoryAudit();
    void logAuditDetails();
    void reconcileInventory();
    void verifyStockLevels();
    void checkInventoryDiscrepancies();
    void generateAuditReport();
    void analyzeAuditResults();
    void updateInventoryRecords();
    void closeInventoryAudit();
}
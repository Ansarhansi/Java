package com.ansar.interfaces.external;


import com.ansar.interfaces.internal.EmployeeManagementSystem;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
    @Override
    public void addEmployee() {
        System.out.println("Adding new employee...");
    }

    @Override
    public void removeEmployee() {
        System.out.println("Removing employee...");
    }

    @Override
    public void updateEmployeeDetails() {
        System.out.println("Updating employee details...");
    }

    @Override
    public void viewEmployeeDetails() {
        System.out.println("Viewing employee details...");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary...");
    }

    @Override
    public void processPayroll() {
        System.out.println("Processing payroll...");
    }

    @Override
    public void assignTask() {
        System.out.println("Assigning task to employee...");
    }

    @Override
    public void generateEmployeeReport() {
        System.out.println("Generating employee report...");
    }

    @Override
    public void promoteEmployee() {
        System.out.println("Promoting employee...");
    }
}

package com.ansar.interfaces.external;


import com.ansar.interfaces.internal.CustomerSupportSystem;

public class CustomerSupportSystemImpl implements CustomerSupportSystem {
    @Override
    public void createSupportTicket() {
        System.out.println("Creating support ticket...");
    }

    @Override
    public void resolveTicket() {
        System.out.println("Resolving support ticket...");
    }

    @Override
    public void trackTicketStatus() {
        System.out.println("Tracking support ticket status...");
    }

    @Override
    public void provideSupportChat() {
        System.out.println("Providing support chat...");
    }

    @Override
    public void escalateIssue() {
        System.out.println("Escalating support issue...");
    }

    @Override
    public void closeTicket() {
        System.out.println("Closing support ticket...");
    }

    @Override
    public void generateSupportReport() {
        System.out.println("Generating support report...");
    }
}

package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.CustomerSupport;

public class CustomerSupportImpl implements CustomerSupport {
    @Override
    public void raiseTicket() {
        System.out.println("Raising support ticket...");
    }

    @Override
    public void assignTicket() {
        System.out.println("Assigning ticket to agent...");
    }

    @Override
    public void updateTicket() {
        System.out.println("Updating ticket...");
    }

    @Override
    public void closeTicket() {
        System.out.println("Closing ticket...");
    }

    @Override
    public void reopenTicket() {
        System.out.println("Reopening ticket...");
    }

    @Override
    public void viewTicketHistory() {
        System.out.println("Viewing ticket history...");
    }

    @Override
    public void escalateTicket() {
        System.out.println("Escalating ticket...");
    }
}
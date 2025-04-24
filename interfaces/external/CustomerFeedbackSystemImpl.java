package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.CustomerFeedbackSystem;

public class CustomerFeedbackSystemImpl implements CustomerFeedbackSystem {
    @Override
    public void collectFeedback() {
        System.out.println("Collecting customer feedback...");
    }

    @Override
    public void analyzeFeedback() {
        System.out.println("Analyzing customer feedback...");
    }

    @Override
    public void respondToFeedback() {
        System.out.println("Responding to customer feedback...");
    }

    @Override
    public void escalateFeedback() {
        System.out.println("Escalating customer feedback...");
    }

    @Override
    public void closeFeedbackTicket() {
        System.out.println("Closing feedback ticket...");
    }

    @Override
    public void generateFeedbackReport() {
        System.out.println("Generating feedback report...");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Notifying customer...");
    }

    @Override
    public void trackCustomerSatisfaction() {
        System.out.println("Tracking customer satisfaction...");
    }

    @Override
    public void recommendImprovements() {
        System.out.println("Recommending improvements...");
    }
}

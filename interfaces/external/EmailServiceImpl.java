package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.EmailService;

public class EmailServiceImpl implements EmailService {
    public void composeEmail() {
        System.out.println("Email composed.");
    }
    public void sendEmail() {
        System.out.println("Email sent.");
    }
    public void deleteEmail() {
        System.out.println("Email deleted.");
    }
}

package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.NotificationService;

public class NotificationServiceImpl implements NotificationService {
    public void sendNotification() {
        System.out.println("Notification sent to user.");
    }
}

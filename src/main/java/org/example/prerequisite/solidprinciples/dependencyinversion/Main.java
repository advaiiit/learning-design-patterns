package org.example.prerequisite.solidprinciples.dependencyinversion;

// Dependency Inversion Principle states that rather than classes depending on concrete implementations of other classes,
// they should depend on interfaces or abstract classes. High-level modules should not depend on the low-level module but
// both should depend on interface

interface NotificationService {
    void sendNotification(String message);
}

// Low-level module
class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

// Low-level module
class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

// High-level module using NotificationService interface
class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}

class Main {
    public static void main(String[] args) {
        // Dependency Injection: Passing EmailNotificationService
        NotificationService emailNotificationService = new EmailNotificationService();
        NotificationManager emailnotificationManager = new NotificationManager(emailNotificationService);
        emailnotificationManager.sendNotification("Hello, this is an email notification");

        // Dependency Injection: Passing SMSNotificationService
        NotificationService smsNotificationService = new SMSNotificationService();
        NotificationManager smsNotificationManager = new NotificationManager(smsNotificationService);
        smsNotificationManager.sendNotification("Hello, this is an SMS notification");
    }
}
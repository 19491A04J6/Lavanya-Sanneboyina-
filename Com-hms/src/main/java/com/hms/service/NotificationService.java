package com.hms.service;

import com.hms.entity.Notification;
import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);
    List<Notification> getNotificationsByUser(Long userId);
    List<Notification> getUnreadNotifications(Long userId);
    Long getUnreadNotificationCount(Long userId);
    Notification markAsRead(Long notificationId);
    void deleteNotification(Long notificationId);
    void sendAppointmentNotification(Long userId, String message);
    void sendPrescriptionNotification(Long userId, String message);
    void sendBillingNotification(Long userId, String message);
}
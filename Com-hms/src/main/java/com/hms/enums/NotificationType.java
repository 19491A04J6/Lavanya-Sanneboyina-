package com.hms.enums;

public enum NotificationType {
    APPOINTMENT("Appointment"), PRESCRIPTION("Prescription"), BILLING("Billing"), MEDICAL_RECORD("Medical Record"), SYSTEM("System"), REMINDER("Reminder"), ALERT("Alert");
    private final String displayName;
    NotificationType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
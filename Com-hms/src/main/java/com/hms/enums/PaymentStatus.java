package com.hms.enums;

public enum PaymentStatus {
    PENDING("Pending"), PAID("Paid"), PARTIAL("Partial"), FAILED("Failed"), CANCELLED("Cancelled"), REFUNDED("Refunded");
    private final String displayName;
    PaymentStatus(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
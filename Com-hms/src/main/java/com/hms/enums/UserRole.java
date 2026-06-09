package com.hms.enums;

public enum UserRole {
    ADMIN("Admin"), DOCTOR("Doctor"), PATIENT("Patient"), RECEPTIONIST("Receptionist"), NURSE("Nurse"), LAB_TECHNICIAN("Lab Technician");
    private final String displayName;
    UserRole(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
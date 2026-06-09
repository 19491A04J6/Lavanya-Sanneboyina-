package com.hms.exception;

public class BillingException extends RuntimeException {
    private String billId;
    private String reason;
    public BillingException(String message) { super(message); }
    public BillingException(String billId, String reason) {
        super(String.format("Billing Error for Bill ID: %s - %s", billId, reason));
        this.billId = billId;
        this.reason = reason;
    }
    public String getBillId() { return billId; }
    public String getReason() { return reason; }
}
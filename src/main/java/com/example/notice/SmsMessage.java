package com.example.notice;

public class SmsMessage {
    private String phoneNumber;
    private String message;
    private String eventType;

    public SmsMessage(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.eventType = "SmsMessage";
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

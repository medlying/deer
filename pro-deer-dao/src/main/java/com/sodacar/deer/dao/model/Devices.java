package com.sodacar.deer.dao.model;

import java.util.Date;

public class Devices {
    private String number;

    private String cardNumber;

    private String status;

    private Byte enabled;

    private Date createdAt;

    private String createdByName;

    private String createdByType;

    private Date updatedAt;

    private String updatedByName;

    private String updatedByType;

    public Devices(String number, String cardNumber, String status, Byte enabled, Date createdAt, String createdByName, String createdByType, Date updatedAt, String updatedByName, String updatedByType) {
        this.number = number;
        this.cardNumber = cardNumber;
        this.status = status;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
        this.updatedAt = updatedAt;
        this.updatedByName = updatedByName;
        this.updatedByType = updatedByType;
    }

    public Devices() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public String getCreatedByType() {
        return createdByType;
    }

    public void setCreatedByType(String createdByType) {
        this.createdByType = createdByType == null ? null : createdByType.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName == null ? null : updatedByName.trim();
    }

    public String getUpdatedByType() {
        return updatedByType;
    }

    public void setUpdatedByType(String updatedByType) {
        this.updatedByType = updatedByType == null ? null : updatedByType.trim();
    }
}
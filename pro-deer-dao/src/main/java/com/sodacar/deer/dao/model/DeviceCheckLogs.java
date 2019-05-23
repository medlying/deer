package com.sodacar.deer.dao.model;

import java.util.Date;

public class DeviceCheckLogs {
    private String deviceNumber;

    private String status;

    private Date createdAt;

    private String createdByName;

    private String createdByType;

    public DeviceCheckLogs(String deviceNumber, String status, Date createdAt, String createdByName, String createdByType) {
        this.deviceNumber = deviceNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
    }

    public DeviceCheckLogs() {
        super();
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}
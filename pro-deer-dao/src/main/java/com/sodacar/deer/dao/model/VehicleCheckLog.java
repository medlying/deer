package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleCheckLog {
    private String uuid;

    private String deviceNumber;

    private String status;

    private DateTime createdAt;

    private String createdByName;

    private String createdByType;

    public VehicleCheckLog(String uuid, String deviceNumber, String status, DateTime createdAt, String createdByName, String createdByType) {
        this.uuid = uuid;
        this.deviceNumber = deviceNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
    }

    public VehicleCheckLog() {
        super();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
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
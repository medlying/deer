package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleCheckLog {
    private Long id;

    private Long deviceId;

    private String deviceNumber;

    private String status;

    private DateTime createdAt;

    private Long creatorId;

    private String creatorName;

    private String creatorType;

    private String info;

    public VehicleCheckLog(Long id, Long deviceId, String deviceNumber, String status, DateTime createdAt, Long creatorId, String creatorName, String creatorType) {
        this.id = id;
        this.deviceId = deviceId;
        this.deviceNumber = deviceNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.creatorType = creatorType;
    }

    public VehicleCheckLog(Long id, Long deviceId, String deviceNumber, String status, DateTime createdAt, Long creatorId, String creatorName, String creatorType, String info) {
        this.id = id;
        this.deviceId = deviceId;
        this.deviceNumber = deviceNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.creatorType = creatorType;
        this.info = info;
    }

    public VehicleCheckLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(String creatorType) {
        this.creatorType = creatorType == null ? null : creatorType.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}
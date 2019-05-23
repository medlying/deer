package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class DeviceAssignDealerLog {
    private String uuid;

    private String dealerName;

    private Boolean status;

    private DateTime createdAt;

    private String createdByName;

    private String createdByType;

    public DeviceAssignDealerLog(String uuid, String dealerName, Boolean status, DateTime createdAt, String createdByName, String createdByType) {
        this.uuid = uuid;
        this.dealerName = dealerName;
        this.status = status;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
    }

    public DeviceAssignDealerLog() {
        super();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
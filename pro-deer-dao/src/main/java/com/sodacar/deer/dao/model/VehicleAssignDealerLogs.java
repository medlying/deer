package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleAssignDealerLogs {
    private String dealerName;

    private Byte status;

    private Date createdAt;

    private String createdByName;

    private String createdByType;

    public VehicleAssignDealerLogs(String dealerName, Byte status, Date createdAt, String createdByName, String createdByType) {
        this.dealerName = dealerName;
        this.status = status;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
    }

    public VehicleAssignDealerLogs() {
        super();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
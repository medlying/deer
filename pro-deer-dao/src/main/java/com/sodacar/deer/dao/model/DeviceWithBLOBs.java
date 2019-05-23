package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class DeviceWithBLOBs extends Device {
    private String createdById;

    private String updatedById;

    public DeviceWithBLOBs(String uuid, String number, String cardNumber, String status, Boolean enabled, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType, String createdById, String updatedById) {
        super(uuid, number, cardNumber, status, enabled, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public DeviceWithBLOBs() {
        super();
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById == null ? null : updatedById.trim();
    }
}
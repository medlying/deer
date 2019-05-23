package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleBrandWithBLOBs extends VehicleBrand {
    private String bid;

    private String createdById;

    private String updatedById;

    public VehicleBrandWithBLOBs(String uuid, String name, String url, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType, String bid, String createdById, String updatedById) {
        super(uuid, name, url, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.bid = bid;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public VehicleBrandWithBLOBs() {
        super();
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
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
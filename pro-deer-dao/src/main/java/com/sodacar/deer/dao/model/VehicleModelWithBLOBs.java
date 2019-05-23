package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleModelWithBLOBs extends VehicleModel {
    private String bid;

    private String brandId;

    private String createdById;

    private String updatedById;

    public VehicleModelWithBLOBs(String uuid, String name, String brandName, String url, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType, String bid, String brandId, String createdById, String updatedById) {
        super(uuid, name, brandName, url, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.bid = bid;
        this.brandId = brandId;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public VehicleModelWithBLOBs() {
        super();
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
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
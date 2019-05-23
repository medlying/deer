package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleBrandsWithBLOBs extends VehicleBrands {
    private byte[] uuid;

    private byte[] bid;

    private byte[] createdById;

    private byte[] updatedById;

    public VehicleBrandsWithBLOBs(String name, String url, Date createdAt, String createdByName, String createdByType, Date updatedAt, String updatedByName, String updatedByType, byte[] uuid, byte[] bid, byte[] createdById, byte[] updatedById) {
        super(name, url, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.uuid = uuid;
        this.bid = bid;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public VehicleBrandsWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    public byte[] getBid() {
        return bid;
    }

    public void setBid(byte[] bid) {
        this.bid = bid;
    }

    public byte[] getCreatedById() {
        return createdById;
    }

    public void setCreatedById(byte[] createdById) {
        this.createdById = createdById;
    }

    public byte[] getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(byte[] updatedById) {
        this.updatedById = updatedById;
    }
}
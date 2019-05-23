package com.sodacar.deer.dao.model;

import java.util.Date;

public class FactoriesWithBLOBs extends Factories {
    private byte[] uuid;

    private byte[] createdById;

    private byte[] updatedById;

    public FactoriesWithBLOBs(String number, String name, String code, Byte enabled, Date createdAt, String createdByName, String createdByType, Date updatedAt, String updatedByName, String updatedByType, byte[] uuid, byte[] createdById, byte[] updatedById) {
        super(number, name, code, enabled, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.uuid = uuid;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public FactoriesWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
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
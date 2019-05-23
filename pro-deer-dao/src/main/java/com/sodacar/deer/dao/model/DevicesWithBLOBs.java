package com.sodacar.deer.dao.model;

import java.util.Date;

public class DevicesWithBLOBs extends Devices {
    private byte[] uuid;

    private byte[] createdById;

    private byte[] updatedById;

    public DevicesWithBLOBs(String number, String cardNumber, String status, Byte enabled, Date createdAt, String createdByName, String createdByType, Date updatedAt, String updatedByName, String updatedByType, byte[] uuid, byte[] createdById, byte[] updatedById) {
        super(number, cardNumber, status, enabled, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.uuid = uuid;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public DevicesWithBLOBs() {
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
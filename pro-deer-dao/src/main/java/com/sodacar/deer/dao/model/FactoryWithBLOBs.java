package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class FactoryWithBLOBs extends Factory {
    private String createdById;

    private String updatedById;

    public FactoryWithBLOBs(String uuid, String number, String name, String code, Boolean enabled, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType, String createdById, String updatedById) {
        super(uuid, number, name, code, enabled, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public FactoryWithBLOBs() {
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
package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class DealerWithBLOBs extends Dealer {
    private String createdById;

    private String updatedById;

    public DealerWithBLOBs(String uuid, String number, String name, Boolean enabled, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType, String createdById, String updatedById) {
        super(uuid, number, name, enabled, createdAt, createdByName, createdByType, updatedAt, updatedByName, updatedByType);
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public DealerWithBLOBs() {
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
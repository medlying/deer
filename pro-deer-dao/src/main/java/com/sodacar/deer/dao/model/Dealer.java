package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class Dealer {
    private String uuid;

    private String number;

    private String name;

    private Boolean enabled;

    private DateTime createdAt;

    private String createdByName;

    private String createdByType;

    private DateTime updatedAt;

    private String updatedByName;

    private String updatedByType;

    public Dealer(String uuid, String number, String name, Boolean enabled, DateTime createdAt, String createdByName, String createdByType, DateTime updatedAt, String updatedByName, String updatedByType) {
        this.uuid = uuid;
        this.number = number;
        this.name = name;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
        this.updatedAt = updatedAt;
        this.updatedByName = updatedByName;
        this.updatedByType = updatedByType;
    }

    public Dealer() {
        super();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName == null ? null : updatedByName.trim();
    }

    public String getUpdatedByType() {
        return updatedByType;
    }

    public void setUpdatedByType(String updatedByType) {
        this.updatedByType = updatedByType == null ? null : updatedByType.trim();
    }
}
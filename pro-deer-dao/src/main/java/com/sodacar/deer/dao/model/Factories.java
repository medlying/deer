package com.sodacar.deer.dao.model;

import java.util.Date;

public class Factories {
    private String number;

    private String name;

    private String code;

    private Byte enabled;

    private Date createdAt;

    private String createdByName;

    private String createdByType;

    private Date updatedAt;

    private String updatedByName;

    private String updatedByType;

    public Factories(String number, String name, String code, Byte enabled, Date createdAt, String createdByName, String createdByType, Date updatedAt, String updatedByName, String updatedByType) {
        this.number = number;
        this.name = name;
        this.code = code;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.createdByType = createdByType;
        this.updatedAt = updatedAt;
        this.updatedByName = updatedByName;
        this.updatedByType = updatedByType;
    }

    public Factories() {
        super();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
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
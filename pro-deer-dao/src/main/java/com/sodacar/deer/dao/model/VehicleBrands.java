package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleBrands {
    private String name;

    private Date createdAt;

    private String sourceFrom;

    private Integer sourceId;

    private String dataFrom;

    private byte[] uuid;

    public VehicleBrands(String name, Date createdAt, String sourceFrom, Integer sourceId, String dataFrom) {
        this.name = name;
        this.createdAt = createdAt;
        this.sourceFrom = sourceFrom;
        this.sourceId = sourceId;
        this.dataFrom = dataFrom;
    }

    public VehicleBrands(String name, Date createdAt, String sourceFrom, Integer sourceId, String dataFrom, byte[] uuid) {
        this.name = name;
        this.createdAt = createdAt;
        this.sourceFrom = sourceFrom;
        this.sourceId = sourceId;
        this.dataFrom = dataFrom;
        this.uuid = uuid;
    }

    public VehicleBrands() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }
}
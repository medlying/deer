package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleCheckLogWithBLOBs extends VehicleCheckLog {
    private String deviceId;

    private String info;

    private String createdById;

    public VehicleCheckLogWithBLOBs(String uuid, String deviceNumber, String status, DateTime createdAt, String createdByName, String createdByType, String deviceId, String info, String createdById) {
        super(uuid, deviceNumber, status, createdAt, createdByName, createdByType);
        this.deviceId = deviceId;
        this.info = info;
        this.createdById = createdById;
    }

    public VehicleCheckLogWithBLOBs() {
        super();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }
}
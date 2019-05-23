package com.sodacar.deer.dao.model;

import java.util.Date;

public class DeviceCheckLogsWithBLOBs extends DeviceCheckLogs {
    private byte[] uuid;

    private byte[] deviceId;

    private String info;

    private byte[] createdById;

    public DeviceCheckLogsWithBLOBs(String deviceNumber, String status, Date createdAt, String createdByName, String createdByType, byte[] uuid, byte[] deviceId, String info, byte[] createdById) {
        super(deviceNumber, status, createdAt, createdByName, createdByType);
        this.uuid = uuid;
        this.deviceId = deviceId;
        this.info = info;
        this.createdById = createdById;
    }

    public DeviceCheckLogsWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    public byte[] getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(byte[] deviceId) {
        this.deviceId = deviceId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public byte[] getCreatedById() {
        return createdById;
    }

    public void setCreatedById(byte[] createdById) {
        this.createdById = createdById;
    }
}
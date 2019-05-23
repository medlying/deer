package com.sodacar.deer.dao.model;

import java.util.Date;

public class DeviceAssignDealerLogsWithBLOBs extends DeviceAssignDealerLogs {
    private byte[] uuid;

    private byte[] dealerId;

    private String deviceList;

    private String info;

    private byte[] createdById;

    public DeviceAssignDealerLogsWithBLOBs(String dealerName, Byte status, Date createdAt, String createdByName, String createdByType, byte[] uuid, byte[] dealerId, String deviceList, String info, byte[] createdById) {
        super(dealerName, status, createdAt, createdByName, createdByType);
        this.uuid = uuid;
        this.dealerId = dealerId;
        this.deviceList = deviceList;
        this.info = info;
        this.createdById = createdById;
    }

    public DeviceAssignDealerLogsWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    public byte[] getDealerId() {
        return dealerId;
    }

    public void setDealerId(byte[] dealerId) {
        this.dealerId = dealerId;
    }

    public String getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(String deviceList) {
        this.deviceList = deviceList == null ? null : deviceList.trim();
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
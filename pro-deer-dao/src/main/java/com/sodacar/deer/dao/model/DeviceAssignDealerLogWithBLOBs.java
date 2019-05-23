package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class DeviceAssignDealerLogWithBLOBs extends DeviceAssignDealerLog {
    private String dealerId;

    private String deviceList;

    private String info;

    private String createdById;

    public DeviceAssignDealerLogWithBLOBs(String uuid, String dealerName, Boolean status, DateTime createdAt, String createdByName, String createdByType, String dealerId, String deviceList, String info, String createdById) {
        super(uuid, dealerName, status, createdAt, createdByName, createdByType);
        this.dealerId = dealerId;
        this.deviceList = deviceList;
        this.info = info;
        this.createdById = createdById;
    }

    public DeviceAssignDealerLogWithBLOBs() {
        super();
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
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

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }
}
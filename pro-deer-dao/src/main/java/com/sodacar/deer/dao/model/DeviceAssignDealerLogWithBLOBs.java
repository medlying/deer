package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class DeviceAssignDealerLogWithBLOBs extends DeviceAssignDealerLog {
    private String deviceList;

    private String info;

    public DeviceAssignDealerLogWithBLOBs(Long id, Long dealerId, String dealerName, Boolean status, DateTime createdAt, Long creatorId, String creatorName, String creatorType, String deviceList, String info) {
        super(id, dealerId, dealerName, status, createdAt, creatorId, creatorName, creatorType);
        this.deviceList = deviceList;
        this.info = info;
    }

    public DeviceAssignDealerLogWithBLOBs() {
        super();
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
}
package com.sodacar.deer.dao.model;

public class DeviceAssignDealerLogWithBLOBs extends DeviceAssignDealerLog {
    private String deviceList;

    private String info;

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
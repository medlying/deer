package com.sodacar.deer.dao.model;

public class VehicleAssignDealerLogWithBLOBs extends VehicleAssignDealerLog {
    private String vehicleList;

    private String info;

    public String getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(String vehicleList) {
        this.vehicleList = vehicleList == null ? null : vehicleList.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}
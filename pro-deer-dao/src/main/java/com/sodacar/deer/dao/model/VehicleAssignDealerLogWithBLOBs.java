package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleAssignDealerLogWithBLOBs extends VehicleAssignDealerLog {
    private String vehicleList;

    private String info;

    public VehicleAssignDealerLogWithBLOBs(Long id, Long dealerId, String dealerName, Boolean status, DateTime createdAt, Long creatorId, String creatorName, String creatorType, String vehicleList, String info) {
        super(id, dealerId, dealerName, status, createdAt, creatorId, creatorName, creatorType);
        this.vehicleList = vehicleList;
        this.info = info;
    }

    public VehicleAssignDealerLogWithBLOBs() {
        super();
    }

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
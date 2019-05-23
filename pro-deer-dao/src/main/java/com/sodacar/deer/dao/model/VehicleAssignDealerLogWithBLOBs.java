package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleAssignDealerLogWithBLOBs extends VehicleAssignDealerLog {
    private String dealerId;

    private String vehicleList;

    private String info;

    private String createdById;

    public VehicleAssignDealerLogWithBLOBs(String uuid, String dealerName, Boolean status, DateTime createdAt, String createdByName, String createdByType, String dealerId, String vehicleList, String info, String createdById) {
        super(uuid, dealerName, status, createdAt, createdByName, createdByType);
        this.dealerId = dealerId;
        this.vehicleList = vehicleList;
        this.info = info;
        this.createdById = createdById;
    }

    public VehicleAssignDealerLogWithBLOBs() {
        super();
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
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

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }
}
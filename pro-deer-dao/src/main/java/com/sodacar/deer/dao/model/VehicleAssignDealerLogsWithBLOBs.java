package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleAssignDealerLogsWithBLOBs extends VehicleAssignDealerLogs {
    private byte[] uuid;

    private byte[] dealerId;

    private String vehicleList;

    private String info;

    private byte[] createdById;

    public VehicleAssignDealerLogsWithBLOBs(String dealerName, Byte status, Date createdAt, String createdByName, String createdByType, byte[] uuid, byte[] dealerId, String vehicleList, String info, byte[] createdById) {
        super(dealerName, status, createdAt, createdByName, createdByType);
        this.uuid = uuid;
        this.dealerId = dealerId;
        this.vehicleList = vehicleList;
        this.info = info;
        this.createdById = createdById;
    }

    public VehicleAssignDealerLogsWithBLOBs() {
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

    public byte[] getCreatedById() {
        return createdById;
    }

    public void setCreatedById(byte[] createdById) {
        this.createdById = createdById;
    }
}
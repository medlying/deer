package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class VehicleWithBLOBs extends Vehicle {
    private String vehicleModelId;

    private String deviceId;

    private String factoryId;

    private String devicesUuid;

    private String dealerId;

    private String createdById;

    private String updatedById;

    public VehicleWithBLOBs(String uuid, String vehicleModeName, String vin, String engineNumber, String deviceNumer, String factoryName, String deviceNumber, String dealerName, String bindMobile, String color, String licenseNumber, DateTime productAt, String status, DateTime createdAt, String createdByName, DateTime updatedAt, String updatedByName, String createdByType, String updatedByType, String vehicleModelId, String deviceId, String factoryId, String devicesUuid, String dealerId, String createdById, String updatedById) {
        super(uuid, vehicleModeName, vin, engineNumber, deviceNumer, factoryName, deviceNumber, dealerName, bindMobile, color, licenseNumber, productAt, status, createdAt, createdByName, updatedAt, updatedByName, createdByType, updatedByType);
        this.vehicleModelId = vehicleModelId;
        this.deviceId = deviceId;
        this.factoryId = factoryId;
        this.devicesUuid = devicesUuid;
        this.dealerId = dealerId;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public VehicleWithBLOBs() {
        super();
    }

    public String getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(String vehicleModelId) {
        this.vehicleModelId = vehicleModelId == null ? null : vehicleModelId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId == null ? null : factoryId.trim();
    }

    public String getDevicesUuid() {
        return devicesUuid;
    }

    public void setDevicesUuid(String devicesUuid) {
        this.devicesUuid = devicesUuid == null ? null : devicesUuid.trim();
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById == null ? null : createdById.trim();
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById == null ? null : updatedById.trim();
    }
}
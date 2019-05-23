package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehiclesWithBLOBs extends Vehicles {
    private byte[] uuid;

    private byte[] vehicleModelId;

    private byte[] deviceId;

    private byte[] factoryId;

    private byte[] devicesUuid;

    private byte[] dealerId;

    private byte[] createdById;

    private byte[] updatedById;

    public VehiclesWithBLOBs(String vehicleModeName, String vin, String engineNumber, String deviceNumer, String factoryName, String deviceNumber, String dealerName, String bindMobile, String color, String licenseNumber, Date productAt, String status, Date createdAt, String createdByName, Date updatedAt, String updatedByName, String createdByType, String updatedByType, byte[] uuid, byte[] vehicleModelId, byte[] deviceId, byte[] factoryId, byte[] devicesUuid, byte[] dealerId, byte[] createdById, byte[] updatedById) {
        super(vehicleModeName, vin, engineNumber, deviceNumer, factoryName, deviceNumber, dealerName, bindMobile, color, licenseNumber, productAt, status, createdAt, createdByName, updatedAt, updatedByName, createdByType, updatedByType);
        this.uuid = uuid;
        this.vehicleModelId = vehicleModelId;
        this.deviceId = deviceId;
        this.factoryId = factoryId;
        this.devicesUuid = devicesUuid;
        this.dealerId = dealerId;
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    public VehiclesWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    public byte[] getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(byte[] vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public byte[] getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(byte[] deviceId) {
        this.deviceId = deviceId;
    }

    public byte[] getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(byte[] factoryId) {
        this.factoryId = factoryId;
    }

    public byte[] getDevicesUuid() {
        return devicesUuid;
    }

    public void setDevicesUuid(byte[] devicesUuid) {
        this.devicesUuid = devicesUuid;
    }

    public byte[] getDealerId() {
        return dealerId;
    }

    public void setDealerId(byte[] dealerId) {
        this.dealerId = dealerId;
    }

    public byte[] getCreatedById() {
        return createdById;
    }

    public void setCreatedById(byte[] createdById) {
        this.createdById = createdById;
    }

    public byte[] getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(byte[] updatedById) {
        this.updatedById = updatedById;
    }
}
package com.sodacar.deer.dao.model;

import java.util.Date;

public class Vehicles {
    private String vehicleModeName;

    private String vin;

    private String engineNumber;

    private String deviceNumer;

    private String factoryName;

    private String deviceNumber;

    private String dealerName;

    private String bindMobile;

    private String color;

    private String licenseNumber;

    private Date productAt;

    private String status;

    private Date createdAt;

    private String createdByName;

    private Date updatedAt;

    private String updatedByName;

    private String createdByType;

    private String updatedByType;

    public Vehicles(String vehicleModeName, String vin, String engineNumber, String deviceNumer, String factoryName, String deviceNumber, String dealerName, String bindMobile, String color, String licenseNumber, Date productAt, String status, Date createdAt, String createdByName, Date updatedAt, String updatedByName, String createdByType, String updatedByType) {
        this.vehicleModeName = vehicleModeName;
        this.vin = vin;
        this.engineNumber = engineNumber;
        this.deviceNumer = deviceNumer;
        this.factoryName = factoryName;
        this.deviceNumber = deviceNumber;
        this.dealerName = dealerName;
        this.bindMobile = bindMobile;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.productAt = productAt;
        this.status = status;
        this.createdAt = createdAt;
        this.createdByName = createdByName;
        this.updatedAt = updatedAt;
        this.updatedByName = updatedByName;
        this.createdByType = createdByType;
        this.updatedByType = updatedByType;
    }

    public Vehicles() {
        super();
    }

    public String getVehicleModeName() {
        return vehicleModeName;
    }

    public void setVehicleModeName(String vehicleModeName) {
        this.vehicleModeName = vehicleModeName == null ? null : vehicleModeName.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getDeviceNumer() {
        return deviceNumer;
    }

    public void setDeviceNumer(String deviceNumer) {
        this.deviceNumer = deviceNumer == null ? null : deviceNumer.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile == null ? null : bindMobile.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public Date getProductAt() {
        return productAt;
    }

    public void setProductAt(Date productAt) {
        this.productAt = productAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName == null ? null : updatedByName.trim();
    }

    public String getCreatedByType() {
        return createdByType;
    }

    public void setCreatedByType(String createdByType) {
        this.createdByType = createdByType == null ? null : createdByType.trim();
    }

    public String getUpdatedByType() {
        return updatedByType;
    }

    public void setUpdatedByType(String updatedByType) {
        this.updatedByType = updatedByType == null ? null : updatedByType.trim();
    }
}
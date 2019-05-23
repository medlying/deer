package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class Vehicle {
    private Long id;

    private Long vehicleModelId;

    private String vehicleModeName;

    private String vin;

    private String engineNumber;

    private Long factoryId;

    private String factoryName;

    private Long deviceId;

    private String deviceNumber;

    private Long dealerId;

    private String dealerName;

    private String bindMobile;

    private String color;

    private String licenseNumber;

    private DateTime productAt;

    private String status;

    private DateTime createdAt;

    private Long creatorId;

    private String creatorName;

    private DateTime updatedAt;

    private Long updaterId;

    private String updaterName;

    private String creatorType;

    private String updaterType;

    public Vehicle(Long id, Long vehicleModelId, String vehicleModeName, String vin, String engineNumber, Long factoryId, String factoryName, Long deviceId, String deviceNumber, Long dealerId, String dealerName, String bindMobile, String color, String licenseNumber, DateTime productAt, String status, DateTime createdAt, Long creatorId, String creatorName, DateTime updatedAt, Long updaterId, String updaterName, String creatorType, String updaterType) {
        this.id = id;
        this.vehicleModelId = vehicleModelId;
        this.vehicleModeName = vehicleModeName;
        this.vin = vin;
        this.engineNumber = engineNumber;
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.deviceId = deviceId;
        this.deviceNumber = deviceNumber;
        this.dealerId = dealerId;
        this.dealerName = dealerName;
        this.bindMobile = bindMobile;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.productAt = productAt;
        this.status = status;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.updatedAt = updatedAt;
        this.updaterId = updaterId;
        this.updaterName = updaterName;
        this.creatorType = creatorType;
        this.updaterType = updaterType;
    }

    public Vehicle() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(Long vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
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

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
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

    public DateTime getProductAt() {
        return productAt;
    }

    public void setProductAt(DateTime productAt) {
        this.productAt = productAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }

    public String getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(String creatorType) {
        this.creatorType = creatorType == null ? null : creatorType.trim();
    }

    public String getUpdaterType() {
        return updaterType;
    }

    public void setUpdaterType(String updaterType) {
        this.updaterType = updaterType == null ? null : updaterType.trim();
    }
}
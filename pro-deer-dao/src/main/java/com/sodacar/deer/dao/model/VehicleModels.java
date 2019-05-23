package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleModels {
    private String brand;

    private String model;

    private String modelYear;

    private String class;

    private String type;

    private String engineType;

    private Double fuelConsumption;

    private String fuelNumber;

    private Integer capacity;

    private Double fuelTankCapacity;

    private Integer batteryMileage;

    private Date createdAt;

    private Boolean enabled;

    private String usageUrl;

    private String sourceFrom;

    private Integer sourceId;

    private String operationMode;

    private String dataFrom;

    public VehicleModels(String brand, String model, String modelYear, String class, String type, String engineType, Double fuelConsumption, String fuelNumber, Integer capacity, Double fuelTankCapacity, Integer batteryMileage, Date createdAt, Boolean enabled, String usageUrl, String sourceFrom, Integer sourceId, String operationMode, String dataFrom) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.class = class;
        this.type = type;
        this.engineType = engineType;
        this.fuelConsumption = fuelConsumption;
        this.fuelNumber = fuelNumber;
        this.capacity = capacity;
        this.fuelTankCapacity = fuelTankCapacity;
        this.batteryMileage = batteryMileage;
        this.createdAt = createdAt;
        this.enabled = enabled;
        this.usageUrl = usageUrl;
        this.sourceFrom = sourceFrom;
        this.sourceId = sourceId;
        this.operationMode = operationMode;
        this.dataFrom = dataFrom;
    }

    public VehicleModels() {
        super();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear == null ? null : modelYear.trim();
    }

    public String getClass() {
        return class;
    }

    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelNumber() {
        return fuelNumber;
    }

    public void setFuelNumber(String fuelNumber) {
        this.fuelNumber = fuelNumber == null ? null : fuelNumber.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(Double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Integer getBatteryMileage() {
        return batteryMileage;
    }

    public void setBatteryMileage(Integer batteryMileage) {
        this.batteryMileage = batteryMileage;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsageUrl() {
        return usageUrl;
    }

    public void setUsageUrl(String usageUrl) {
        this.usageUrl = usageUrl == null ? null : usageUrl.trim();
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode == null ? null : operationMode.trim();
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }
}
package com.sodacar.deer.dao.model;

import java.util.Date;

public class VehicleModelsWithBLOBs extends VehicleModels {
    private byte[] uuid;

    private String images;

    private String keyImages;

    public VehicleModelsWithBLOBs(String brand, String model, String modelYear, String class, String type, String engineType, Double fuelConsumption, String fuelNumber, Integer capacity, Double fuelTankCapacity, Integer batteryMileage, Date createdAt, Boolean enabled, String usageUrl, String sourceFrom, Integer sourceId, String operationMode, String dataFrom, byte[] uuid, String images, String keyImages) {
        super(brand, model, modelYear, class, type, engineType, fuelConsumption, fuelNumber, capacity, fuelTankCapacity, batteryMileage, createdAt, enabled, usageUrl, sourceFrom, sourceId, operationMode, dataFrom);
        this.uuid = uuid;
        this.images = images;
        this.keyImages = keyImages;
    }

    public VehicleModelsWithBLOBs() {
        super();
    }

    public byte[] getUuid() {
        return uuid;
    }

    public void setUuid(byte[] uuid) {
        this.uuid = uuid;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getKeyImages() {
        return keyImages;
    }

    public void setKeyImages(String keyImages) {
        this.keyImages = keyImages == null ? null : keyImages.trim();
    }
}
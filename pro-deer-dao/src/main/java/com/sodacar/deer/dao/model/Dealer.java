package com.sodacar.deer.dao.model;

import org.joda.time.DateTime;

public class Dealer {
    private Long id;

    private String number;

    private String name;

    private Boolean isDeleted;

    private DateTime createdAt;

    private Long creatorId;

    private String creatorName;

    private String creatorType;

    private DateTime updatedAt;

    private Long updaterId;

    private String updaterName;

    private String updaterType;

    public Dealer(Long id, String number, String name, Boolean isDeleted, DateTime createdAt, Long creatorId, String creatorName, String creatorType, DateTime updatedAt, Long updaterId, String updaterName, String updaterType) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.creatorType = creatorType;
        this.updatedAt = updatedAt;
        this.updaterId = updaterId;
        this.updaterName = updaterName;
        this.updaterType = updaterType;
    }

    public Dealer() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    public String getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(String creatorType) {
        this.creatorType = creatorType == null ? null : creatorType.trim();
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

    public String getUpdaterType() {
        return updaterType;
    }

    public void setUpdaterType(String updaterType) {
        this.updaterType = updaterType == null ? null : updaterType.trim();
    }
}
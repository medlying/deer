package com.sodacar.deer.dao.model;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class VehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int start = -1;

    protected int limit = -1;

    public VehicleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setStart(int start) {
        this.start=start;
    }

    public int getStart() {
        return start;
    }

    public void setLimit(int limit) {
        this.limit=limit;
    }

    public int getLimit() {
        return limit;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> productAtCriteria;

        protected List<Criterion> createdAtCriteria;

        protected List<Criterion> updatedAtCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            productAtCriteria = new ArrayList<Criterion>();
            createdAtCriteria = new ArrayList<Criterion>();
            updatedAtCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getProductAtCriteria() {
            return productAtCriteria;
        }

        protected void addProductAtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            productAtCriteria.add(new Criterion(condition, value, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addProductAtCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            productAtCriteria.add(new Criterion(condition, value1, value2, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getCreatedAtCriteria() {
            return createdAtCriteria;
        }

        protected void addCreatedAtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            createdAtCriteria.add(new Criterion(condition, value, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addCreatedAtCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            createdAtCriteria.add(new Criterion(condition, value1, value2, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getUpdatedAtCriteria() {
            return updatedAtCriteria;
        }

        protected void addUpdatedAtCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            updatedAtCriteria.add(new Criterion(condition, value, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addUpdatedAtCriterion(String condition, DateTime value1, DateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            updatedAtCriteria.add(new Criterion(condition, value1, value2, "com.sodacar.deer.dao.handler.DateTimeTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || productAtCriteria.size() > 0
                || createdAtCriteria.size() > 0
                || updatedAtCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(productAtCriteria);
                allCriteria.addAll(createdAtCriteria);
                allCriteria.addAll(updatedAtCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNull() {
            addCriterion("vehicle_model_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNotNull() {
            addCriterion("vehicle_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdEqualTo(Long value) {
            addCriterion("vehicle_model_id =", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotEqualTo(Long value) {
            addCriterion("vehicle_model_id <>", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThan(Long value) {
            addCriterion("vehicle_model_id >", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vehicle_model_id >=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThan(Long value) {
            addCriterion("vehicle_model_id <", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThanOrEqualTo(Long value) {
            addCriterion("vehicle_model_id <=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIn(List<Long> values) {
            addCriterion("vehicle_model_id in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotIn(List<Long> values) {
            addCriterion("vehicle_model_id not in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdBetween(Long value1, Long value2) {
            addCriterion("vehicle_model_id between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotBetween(Long value1, Long value2) {
            addCriterion("vehicle_model_id not between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameIsNull() {
            addCriterion("vehicle_mode_name is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameIsNotNull() {
            addCriterion("vehicle_mode_name is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameEqualTo(String value) {
            addCriterion("vehicle_mode_name =", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotEqualTo(String value) {
            addCriterion("vehicle_mode_name <>", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameGreaterThan(String value) {
            addCriterion("vehicle_mode_name >", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_mode_name >=", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLessThan(String value) {
            addCriterion("vehicle_mode_name <", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLessThanOrEqualTo(String value) {
            addCriterion("vehicle_mode_name <=", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLike(String value) {
            addCriterion("vehicle_mode_name like", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotLike(String value) {
            addCriterion("vehicle_mode_name not like", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameIn(List<String> values) {
            addCriterion("vehicle_mode_name in", values, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotIn(List<String> values) {
            addCriterion("vehicle_mode_name not in", values, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameBetween(String value1, String value2) {
            addCriterion("vehicle_mode_name between", value1, value2, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotBetween(String value1, String value2) {
            addCriterion("vehicle_mode_name not between", value1, value2, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("factory_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("factory_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Long value) {
            addCriterion("factory_id =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Long value) {
            addCriterion("factory_id <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Long value) {
            addCriterion("factory_id >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("factory_id >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Long value) {
            addCriterion("factory_id <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Long value) {
            addCriterion("factory_id <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Long> values) {
            addCriterion("factory_id in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Long> values) {
            addCriterion("factory_id not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Long value1, Long value2) {
            addCriterion("factory_id between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Long value1, Long value2) {
            addCriterion("factory_id not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("device_number is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("device_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("device_number =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("device_number <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("device_number >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("device_number >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("device_number <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("device_number <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("device_number like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("device_number not like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<String> values) {
            addCriterion("device_number in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<String> values) {
            addCriterion("device_number not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("device_number between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("device_number not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Long value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Long value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Long value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Long value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Long value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Long> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Long> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Long value1, Long value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Long value1, Long value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNull() {
            addCriterion("bind_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNotNull() {
            addCriterion("bind_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBindMobileEqualTo(String value) {
            addCriterion("bind_mobile =", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotEqualTo(String value) {
            addCriterion("bind_mobile <>", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThan(String value) {
            addCriterion("bind_mobile >", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bind_mobile >=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThan(String value) {
            addCriterion("bind_mobile <", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThanOrEqualTo(String value) {
            addCriterion("bind_mobile <=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLike(String value) {
            addCriterion("bind_mobile like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotLike(String value) {
            addCriterion("bind_mobile not like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileIn(List<String> values) {
            addCriterion("bind_mobile in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotIn(List<String> values) {
            addCriterion("bind_mobile not in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileBetween(String value1, String value2) {
            addCriterion("bind_mobile between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotBetween(String value1, String value2) {
            addCriterion("bind_mobile not between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andProductAtIsNull() {
            addCriterion("product_at is null");
            return (Criteria) this;
        }

        public Criteria andProductAtIsNotNull() {
            addCriterion("product_at is not null");
            return (Criteria) this;
        }

        public Criteria andProductAtEqualTo(DateTime value) {
            addProductAtCriterion("product_at =", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotEqualTo(DateTime value) {
            addProductAtCriterion("product_at <>", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtGreaterThan(DateTime value) {
            addProductAtCriterion("product_at >", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtGreaterThanOrEqualTo(DateTime value) {
            addProductAtCriterion("product_at >=", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtLessThan(DateTime value) {
            addProductAtCriterion("product_at <", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtLessThanOrEqualTo(DateTime value) {
            addProductAtCriterion("product_at <=", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtIn(List<DateTime> values) {
            addProductAtCriterion("product_at in", values, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotIn(List<DateTime> values) {
            addProductAtCriterion("product_at not in", values, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtBetween(DateTime value1, DateTime value2) {
            addProductAtCriterion("product_at between", value1, value2, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotBetween(DateTime value1, DateTime value2) {
            addProductAtCriterion("product_at not between", value1, value2, "productAt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(DateTime value) {
            addCreatedAtCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(DateTime value) {
            addCreatedAtCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(DateTime value) {
            addCreatedAtCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(DateTime value) {
            addCreatedAtCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(DateTime value) {
            addCreatedAtCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(DateTime value) {
            addCreatedAtCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<DateTime> values) {
            addCreatedAtCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<DateTime> values) {
            addCreatedAtCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(DateTime value1, DateTime value2) {
            addCreatedAtCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(DateTime value1, DateTime value2) {
            addCreatedAtCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(DateTime value) {
            addUpdatedAtCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(DateTime value) {
            addUpdatedAtCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(DateTime value) {
            addUpdatedAtCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(DateTime value) {
            addUpdatedAtCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(DateTime value) {
            addUpdatedAtCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(DateTime value) {
            addUpdatedAtCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<DateTime> values) {
            addUpdatedAtCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<DateTime> values) {
            addUpdatedAtCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(DateTime value1, DateTime value2) {
            addUpdatedAtCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(DateTime value1, DateTime value2) {
            addUpdatedAtCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Long value) {
            addCriterion("updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Long value) {
            addCriterion("updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Long value) {
            addCriterion("updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Long value) {
            addCriterion("updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Long value) {
            addCriterion("updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Long> values) {
            addCriterion("updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Long> values) {
            addCriterion("updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Long value1, Long value2) {
            addCriterion("updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Long value1, Long value2) {
            addCriterion("updater_id not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("updater_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("updater_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("updater_name =", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("updater_name <>", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("updater_name >", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("updater_name >=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("updater_name <", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("updater_name <=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("updater_name like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("updater_name not like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIn(List<String> values) {
            addCriterion("updater_name in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotIn(List<String> values) {
            addCriterion("updater_name not in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("updater_name between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("updater_name not between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIsNull() {
            addCriterion("creator_type is null");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIsNotNull() {
            addCriterion("creator_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeEqualTo(String value) {
            addCriterion("creator_type =", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotEqualTo(String value) {
            addCriterion("creator_type <>", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeGreaterThan(String value) {
            addCriterion("creator_type >", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("creator_type >=", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeLessThan(String value) {
            addCriterion("creator_type <", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeLessThanOrEqualTo(String value) {
            addCriterion("creator_type <=", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeLike(String value) {
            addCriterion("creator_type like", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotLike(String value) {
            addCriterion("creator_type not like", value, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeIn(List<String> values) {
            addCriterion("creator_type in", values, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotIn(List<String> values) {
            addCriterion("creator_type not in", values, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeBetween(String value1, String value2) {
            addCriterion("creator_type between", value1, value2, "creatorType");
            return (Criteria) this;
        }

        public Criteria andCreatorTypeNotBetween(String value1, String value2) {
            addCriterion("creator_type not between", value1, value2, "creatorType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeIsNull() {
            addCriterion("updater_type is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeIsNotNull() {
            addCriterion("updater_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeEqualTo(String value) {
            addCriterion("updater_type =", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeNotEqualTo(String value) {
            addCriterion("updater_type <>", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeGreaterThan(String value) {
            addCriterion("updater_type >", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("updater_type >=", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeLessThan(String value) {
            addCriterion("updater_type <", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeLessThanOrEqualTo(String value) {
            addCriterion("updater_type <=", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeLike(String value) {
            addCriterion("updater_type like", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeNotLike(String value) {
            addCriterion("updater_type not like", value, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeIn(List<String> values) {
            addCriterion("updater_type in", values, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeNotIn(List<String> values) {
            addCriterion("updater_type not in", values, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeBetween(String value1, String value2) {
            addCriterion("updater_type between", value1, value2, "updaterType");
            return (Criteria) this;
        }

        public Criteria andUpdaterTypeNotBetween(String value1, String value2) {
            addCriterion("updater_type not between", value1, value2, "updaterType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
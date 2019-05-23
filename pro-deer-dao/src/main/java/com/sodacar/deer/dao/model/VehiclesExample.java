package com.sodacar.deer.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehiclesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehiclesExample() {
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVehicleModeNameIsNull() {
            addCriterion("VEHICLE_MODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameIsNotNull() {
            addCriterion("VEHICLE_MODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameEqualTo(String value) {
            addCriterion("VEHICLE_MODE_NAME =", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotEqualTo(String value) {
            addCriterion("VEHICLE_MODE_NAME <>", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameGreaterThan(String value) {
            addCriterion("VEHICLE_MODE_NAME >", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODE_NAME >=", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLessThan(String value) {
            addCriterion("VEHICLE_MODE_NAME <", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODE_NAME <=", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameLike(String value) {
            addCriterion("VEHICLE_MODE_NAME like", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotLike(String value) {
            addCriterion("VEHICLE_MODE_NAME not like", value, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameIn(List<String> values) {
            addCriterion("VEHICLE_MODE_NAME in", values, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotIn(List<String> values) {
            addCriterion("VEHICLE_MODE_NAME not in", values, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODE_NAME between", value1, value2, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVehicleModeNameNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODE_NAME not between", value1, value2, "vehicleModeName");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("ENGINE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("ENGINE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("ENGINE_NUMBER =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("ENGINE_NUMBER <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("ENGINE_NUMBER >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_NUMBER >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("ENGINE_NUMBER <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_NUMBER <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("ENGINE_NUMBER like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("ENGINE_NUMBER not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("ENGINE_NUMBER in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("ENGINE_NUMBER not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("ENGINE_NUMBER between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("ENGINE_NUMBER not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerIsNull() {
            addCriterion("DEVICE_NUMER is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerIsNotNull() {
            addCriterion("DEVICE_NUMER is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerEqualTo(String value) {
            addCriterion("DEVICE_NUMER =", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerNotEqualTo(String value) {
            addCriterion("DEVICE_NUMER <>", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerGreaterThan(String value) {
            addCriterion("DEVICE_NUMER >", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMER >=", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerLessThan(String value) {
            addCriterion("DEVICE_NUMER <", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMER <=", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerLike(String value) {
            addCriterion("DEVICE_NUMER like", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerNotLike(String value) {
            addCriterion("DEVICE_NUMER not like", value, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerIn(List<String> values) {
            addCriterion("DEVICE_NUMER in", values, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerNotIn(List<String> values) {
            addCriterion("DEVICE_NUMER not in", values, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMER between", value1, value2, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andDeviceNumerNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMER not between", value1, value2, "deviceNumer");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("FACTORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("FACTORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("FACTORY_NAME =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("FACTORY_NAME <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("FACTORY_NAME >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("FACTORY_NAME <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("FACTORY_NAME like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("FACTORY_NAME not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("FACTORY_NAME in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("FACTORY_NAME not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("DEVICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("DEVICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("DEVICE_NUMBER =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("DEVICE_NUMBER >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("DEVICE_NUMBER <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("DEVICE_NUMBER like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("DEVICE_NUMBER not like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<String> values) {
            addCriterion("DEVICE_NUMBER in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<String> values) {
            addCriterion("DEVICE_NUMBER not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("DEALER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("DEALER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("DEALER_NAME =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("DEALER_NAME <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("DEALER_NAME >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEALER_NAME >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("DEALER_NAME <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("DEALER_NAME <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("DEALER_NAME like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("DEALER_NAME not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("DEALER_NAME in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("DEALER_NAME not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("DEALER_NAME between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("DEALER_NAME not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNull() {
            addCriterion("BIND_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNotNull() {
            addCriterion("BIND_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBindMobileEqualTo(String value) {
            addCriterion("BIND_MOBILE =", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotEqualTo(String value) {
            addCriterion("BIND_MOBILE <>", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThan(String value) {
            addCriterion("BIND_MOBILE >", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_MOBILE >=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThan(String value) {
            addCriterion("BIND_MOBILE <", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThanOrEqualTo(String value) {
            addCriterion("BIND_MOBILE <=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLike(String value) {
            addCriterion("BIND_MOBILE like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotLike(String value) {
            addCriterion("BIND_MOBILE not like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileIn(List<String> values) {
            addCriterion("BIND_MOBILE in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotIn(List<String> values) {
            addCriterion("BIND_MOBILE not in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileBetween(String value1, String value2) {
            addCriterion("BIND_MOBILE between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotBetween(String value1, String value2) {
            addCriterion("BIND_MOBILE not between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("LICENSE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("LICENSE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("LICENSE_NUMBER =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("LICENSE_NUMBER <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("LICENSE_NUMBER >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_NUMBER >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("LICENSE_NUMBER <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_NUMBER <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("LICENSE_NUMBER like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("LICENSE_NUMBER not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("LICENSE_NUMBER in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("LICENSE_NUMBER not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("LICENSE_NUMBER between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("LICENSE_NUMBER not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andProductAtIsNull() {
            addCriterion("PRODUCT_AT is null");
            return (Criteria) this;
        }

        public Criteria andProductAtIsNotNull() {
            addCriterion("PRODUCT_AT is not null");
            return (Criteria) this;
        }

        public Criteria andProductAtEqualTo(Date value) {
            addCriterion("PRODUCT_AT =", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotEqualTo(Date value) {
            addCriterion("PRODUCT_AT <>", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtGreaterThan(Date value) {
            addCriterion("PRODUCT_AT >", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_AT >=", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtLessThan(Date value) {
            addCriterion("PRODUCT_AT <", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCT_AT <=", value, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtIn(List<Date> values) {
            addCriterion("PRODUCT_AT in", values, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotIn(List<Date> values) {
            addCriterion("PRODUCT_AT not in", values, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_AT between", value1, value2, "productAt");
            return (Criteria) this;
        }

        public Criteria andProductAtNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCT_AT not between", value1, value2, "productAt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameIsNull() {
            addCriterion("CREATED_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameIsNotNull() {
            addCriterion("CREATED_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameEqualTo(String value) {
            addCriterion("CREATED_BY_NAME =", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameNotEqualTo(String value) {
            addCriterion("CREATED_BY_NAME <>", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameGreaterThan(String value) {
            addCriterion("CREATED_BY_NAME >", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_NAME >=", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameLessThan(String value) {
            addCriterion("CREATED_BY_NAME <", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_NAME <=", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameLike(String value) {
            addCriterion("CREATED_BY_NAME like", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameNotLike(String value) {
            addCriterion("CREATED_BY_NAME not like", value, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameIn(List<String> values) {
            addCriterion("CREATED_BY_NAME in", values, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameNotIn(List<String> values) {
            addCriterion("CREATED_BY_NAME not in", values, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameBetween(String value1, String value2) {
            addCriterion("CREATED_BY_NAME between", value1, value2, "createdByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByNameNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY_NAME not between", value1, value2, "createdByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("UPDATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("UPDATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("UPDATED_AT =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("UPDATED_AT <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("UPDATED_AT >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("UPDATED_AT <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("UPDATED_AT in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("UPDATED_AT not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameIsNull() {
            addCriterion("UPDATED_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameIsNotNull() {
            addCriterion("UPDATED_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameEqualTo(String value) {
            addCriterion("UPDATED_BY_NAME =", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameNotEqualTo(String value) {
            addCriterion("UPDATED_BY_NAME <>", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameGreaterThan(String value) {
            addCriterion("UPDATED_BY_NAME >", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY_NAME >=", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameLessThan(String value) {
            addCriterion("UPDATED_BY_NAME <", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY_NAME <=", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameLike(String value) {
            addCriterion("UPDATED_BY_NAME like", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameNotLike(String value) {
            addCriterion("UPDATED_BY_NAME not like", value, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameIn(List<String> values) {
            addCriterion("UPDATED_BY_NAME in", values, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameNotIn(List<String> values) {
            addCriterion("UPDATED_BY_NAME not in", values, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameBetween(String value1, String value2) {
            addCriterion("UPDATED_BY_NAME between", value1, value2, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNameNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY_NAME not between", value1, value2, "updatedByName");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeIsNull() {
            addCriterion("CREATED_BY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeIsNotNull() {
            addCriterion("CREATED_BY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeEqualTo(String value) {
            addCriterion("CREATED_BY_TYPE =", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeNotEqualTo(String value) {
            addCriterion("CREATED_BY_TYPE <>", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeGreaterThan(String value) {
            addCriterion("CREATED_BY_TYPE >", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_TYPE >=", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeLessThan(String value) {
            addCriterion("CREATED_BY_TYPE <", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY_TYPE <=", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeLike(String value) {
            addCriterion("CREATED_BY_TYPE like", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeNotLike(String value) {
            addCriterion("CREATED_BY_TYPE not like", value, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeIn(List<String> values) {
            addCriterion("CREATED_BY_TYPE in", values, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeNotIn(List<String> values) {
            addCriterion("CREATED_BY_TYPE not in", values, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeBetween(String value1, String value2) {
            addCriterion("CREATED_BY_TYPE between", value1, value2, "createdByType");
            return (Criteria) this;
        }

        public Criteria andCreatedByTypeNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY_TYPE not between", value1, value2, "createdByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeIsNull() {
            addCriterion("UPDATED_BY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeIsNotNull() {
            addCriterion("UPDATED_BY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeEqualTo(String value) {
            addCriterion("UPDATED_BY_TYPE =", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeNotEqualTo(String value) {
            addCriterion("UPDATED_BY_TYPE <>", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeGreaterThan(String value) {
            addCriterion("UPDATED_BY_TYPE >", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY_TYPE >=", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeLessThan(String value) {
            addCriterion("UPDATED_BY_TYPE <", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY_TYPE <=", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeLike(String value) {
            addCriterion("UPDATED_BY_TYPE like", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeNotLike(String value) {
            addCriterion("UPDATED_BY_TYPE not like", value, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeIn(List<String> values) {
            addCriterion("UPDATED_BY_TYPE in", values, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeNotIn(List<String> values) {
            addCriterion("UPDATED_BY_TYPE not in", values, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeBetween(String value1, String value2) {
            addCriterion("UPDATED_BY_TYPE between", value1, value2, "updatedByType");
            return (Criteria) this;
        }

        public Criteria andUpdatedByTypeNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY_TYPE not between", value1, value2, "updatedByType");
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
package com.sodacar.deer.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleModelsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleModelsExample() {
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

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNull() {
            addCriterion("MODEL_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNotNull() {
            addCriterion("MODEL_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andModelYearEqualTo(String value) {
            addCriterion("MODEL_YEAR =", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotEqualTo(String value) {
            addCriterion("MODEL_YEAR <>", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThan(String value) {
            addCriterion("MODEL_YEAR >", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_YEAR >=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThan(String value) {
            addCriterion("MODEL_YEAR <", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThanOrEqualTo(String value) {
            addCriterion("MODEL_YEAR <=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLike(String value) {
            addCriterion("MODEL_YEAR like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotLike(String value) {
            addCriterion("MODEL_YEAR not like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearIn(List<String> values) {
            addCriterion("MODEL_YEAR in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotIn(List<String> values) {
            addCriterion("MODEL_YEAR not in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearBetween(String value1, String value2) {
            addCriterion("MODEL_YEAR between", value1, value2, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotBetween(String value1, String value2) {
            addCriterion("MODEL_YEAR not between", value1, value2, "modelYear");
            return (Criteria) this;
        }

        public Criteria andClassIsNull() {
            addCriterion("CLASS is null");
            return (Criteria) this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andClassEqualTo(String value) {
            addCriterion("CLASS =", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotEqualTo(String value) {
            addCriterion("CLASS <>", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThan(String value) {
            addCriterion("CLASS >", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS >=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThan(String value) {
            addCriterion("CLASS <", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThanOrEqualTo(String value) {
            addCriterion("CLASS <=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLike(String value) {
            addCriterion("CLASS like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotLike(String value) {
            addCriterion("CLASS not like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassIn(List<String> values) {
            addCriterion("CLASS in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotIn(List<String> values) {
            addCriterion("CLASS not in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassBetween(String value1, String value2) {
            addCriterion("CLASS between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotBetween(String value1, String value2) {
            addCriterion("CLASS not between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNull() {
            addCriterion("ENGINE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNotNull() {
            addCriterion("ENGINE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeEqualTo(String value) {
            addCriterion("ENGINE_TYPE =", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotEqualTo(String value) {
            addCriterion("ENGINE_TYPE <>", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThan(String value) {
            addCriterion("ENGINE_TYPE >", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_TYPE >=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThan(String value) {
            addCriterion("ENGINE_TYPE <", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_TYPE <=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLike(String value) {
            addCriterion("ENGINE_TYPE like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotLike(String value) {
            addCriterion("ENGINE_TYPE not like", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIn(List<String> values) {
            addCriterion("ENGINE_TYPE in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotIn(List<String> values) {
            addCriterion("ENGINE_TYPE not in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeBetween(String value1, String value2) {
            addCriterion("ENGINE_TYPE between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotBetween(String value1, String value2) {
            addCriterion("ENGINE_TYPE not between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionIsNull() {
            addCriterion("FUEL_CONSUMPTION is null");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionIsNotNull() {
            addCriterion("FUEL_CONSUMPTION is not null");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionEqualTo(Double value) {
            addCriterion("FUEL_CONSUMPTION =", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionNotEqualTo(Double value) {
            addCriterion("FUEL_CONSUMPTION <>", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionGreaterThan(Double value) {
            addCriterion("FUEL_CONSUMPTION >", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("FUEL_CONSUMPTION >=", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionLessThan(Double value) {
            addCriterion("FUEL_CONSUMPTION <", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("FUEL_CONSUMPTION <=", value, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionIn(List<Double> values) {
            addCriterion("FUEL_CONSUMPTION in", values, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionNotIn(List<Double> values) {
            addCriterion("FUEL_CONSUMPTION not in", values, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionBetween(Double value1, Double value2) {
            addCriterion("FUEL_CONSUMPTION between", value1, value2, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("FUEL_CONSUMPTION not between", value1, value2, "fuelConsumption");
            return (Criteria) this;
        }

        public Criteria andFuelNumberIsNull() {
            addCriterion("FUEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFuelNumberIsNotNull() {
            addCriterion("FUEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFuelNumberEqualTo(String value) {
            addCriterion("FUEL_NUMBER =", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberNotEqualTo(String value) {
            addCriterion("FUEL_NUMBER <>", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberGreaterThan(String value) {
            addCriterion("FUEL_NUMBER >", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("FUEL_NUMBER >=", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberLessThan(String value) {
            addCriterion("FUEL_NUMBER <", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberLessThanOrEqualTo(String value) {
            addCriterion("FUEL_NUMBER <=", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberLike(String value) {
            addCriterion("FUEL_NUMBER like", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberNotLike(String value) {
            addCriterion("FUEL_NUMBER not like", value, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberIn(List<String> values) {
            addCriterion("FUEL_NUMBER in", values, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberNotIn(List<String> values) {
            addCriterion("FUEL_NUMBER not in", values, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberBetween(String value1, String value2) {
            addCriterion("FUEL_NUMBER between", value1, value2, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andFuelNumberNotBetween(String value1, String value2) {
            addCriterion("FUEL_NUMBER not between", value1, value2, "fuelNumber");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("CAPACITY =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("CAPACITY <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("CAPACITY >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAPACITY >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("CAPACITY <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("CAPACITY <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("CAPACITY in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("CAPACITY not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("CAPACITY between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("CAPACITY not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityIsNull() {
            addCriterion("FUEL_TANK_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityIsNotNull() {
            addCriterion("FUEL_TANK_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityEqualTo(Double value) {
            addCriterion("FUEL_TANK_CAPACITY =", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityNotEqualTo(Double value) {
            addCriterion("FUEL_TANK_CAPACITY <>", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityGreaterThan(Double value) {
            addCriterion("FUEL_TANK_CAPACITY >", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("FUEL_TANK_CAPACITY >=", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityLessThan(Double value) {
            addCriterion("FUEL_TANK_CAPACITY <", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityLessThanOrEqualTo(Double value) {
            addCriterion("FUEL_TANK_CAPACITY <=", value, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityIn(List<Double> values) {
            addCriterion("FUEL_TANK_CAPACITY in", values, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityNotIn(List<Double> values) {
            addCriterion("FUEL_TANK_CAPACITY not in", values, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityBetween(Double value1, Double value2) {
            addCriterion("FUEL_TANK_CAPACITY between", value1, value2, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andFuelTankCapacityNotBetween(Double value1, Double value2) {
            addCriterion("FUEL_TANK_CAPACITY not between", value1, value2, "fuelTankCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageIsNull() {
            addCriterion("BATTERY_MILEAGE is null");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageIsNotNull() {
            addCriterion("BATTERY_MILEAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageEqualTo(Integer value) {
            addCriterion("BATTERY_MILEAGE =", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageNotEqualTo(Integer value) {
            addCriterion("BATTERY_MILEAGE <>", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageGreaterThan(Integer value) {
            addCriterion("BATTERY_MILEAGE >", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("BATTERY_MILEAGE >=", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageLessThan(Integer value) {
            addCriterion("BATTERY_MILEAGE <", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageLessThanOrEqualTo(Integer value) {
            addCriterion("BATTERY_MILEAGE <=", value, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageIn(List<Integer> values) {
            addCriterion("BATTERY_MILEAGE in", values, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageNotIn(List<Integer> values) {
            addCriterion("BATTERY_MILEAGE not in", values, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageBetween(Integer value1, Integer value2) {
            addCriterion("BATTERY_MILEAGE between", value1, value2, "batteryMileage");
            return (Criteria) this;
        }

        public Criteria andBatteryMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("BATTERY_MILEAGE not between", value1, value2, "batteryMileage");
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

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andUsageUrlIsNull() {
            addCriterion("USAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andUsageUrlIsNotNull() {
            addCriterion("USAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUsageUrlEqualTo(String value) {
            addCriterion("USAGE_URL =", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlNotEqualTo(String value) {
            addCriterion("USAGE_URL <>", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlGreaterThan(String value) {
            addCriterion("USAGE_URL >", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("USAGE_URL >=", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlLessThan(String value) {
            addCriterion("USAGE_URL <", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlLessThanOrEqualTo(String value) {
            addCriterion("USAGE_URL <=", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlLike(String value) {
            addCriterion("USAGE_URL like", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlNotLike(String value) {
            addCriterion("USAGE_URL not like", value, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlIn(List<String> values) {
            addCriterion("USAGE_URL in", values, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlNotIn(List<String> values) {
            addCriterion("USAGE_URL not in", values, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlBetween(String value1, String value2) {
            addCriterion("USAGE_URL between", value1, value2, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andUsageUrlNotBetween(String value1, String value2) {
            addCriterion("USAGE_URL not between", value1, value2, "usageUrl");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNull() {
            addCriterion("SOURCE_FROM is null");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNotNull() {
            addCriterion("SOURCE_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andSourceFromEqualTo(String value) {
            addCriterion("SOURCE_FROM =", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotEqualTo(String value) {
            addCriterion("SOURCE_FROM <>", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThan(String value) {
            addCriterion("SOURCE_FROM >", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_FROM >=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThan(String value) {
            addCriterion("SOURCE_FROM <", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_FROM <=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLike(String value) {
            addCriterion("SOURCE_FROM like", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotLike(String value) {
            addCriterion("SOURCE_FROM not like", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromIn(List<String> values) {
            addCriterion("SOURCE_FROM in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotIn(List<String> values) {
            addCriterion("SOURCE_FROM not in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromBetween(String value1, String value2) {
            addCriterion("SOURCE_FROM between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotBetween(String value1, String value2) {
            addCriterion("SOURCE_FROM not between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andOperationModeIsNull() {
            addCriterion("OPERATION_MODE is null");
            return (Criteria) this;
        }

        public Criteria andOperationModeIsNotNull() {
            addCriterion("OPERATION_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationModeEqualTo(String value) {
            addCriterion("OPERATION_MODE =", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotEqualTo(String value) {
            addCriterion("OPERATION_MODE <>", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeGreaterThan(String value) {
            addCriterion("OPERATION_MODE >", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_MODE >=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLessThan(String value) {
            addCriterion("OPERATION_MODE <", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_MODE <=", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeLike(String value) {
            addCriterion("OPERATION_MODE like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotLike(String value) {
            addCriterion("OPERATION_MODE not like", value, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeIn(List<String> values) {
            addCriterion("OPERATION_MODE in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotIn(List<String> values) {
            addCriterion("OPERATION_MODE not in", values, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeBetween(String value1, String value2) {
            addCriterion("OPERATION_MODE between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria andOperationModeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_MODE not between", value1, value2, "operationMode");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("DATA_FROM is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("DATA_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("DATA_FROM =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("DATA_FROM <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("DATA_FROM >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FROM >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("DATA_FROM <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("DATA_FROM <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("DATA_FROM like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("DATA_FROM not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("DATA_FROM in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("DATA_FROM not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("DATA_FROM between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("DATA_FROM not between", value1, value2, "dataFrom");
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
package com.sodacar.deer.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactoriesExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("NUMBER =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("NUMBER <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("NUMBER >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBER >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("NUMBER <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("NUMBER <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("NUMBER like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("NUMBER not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("NUMBER in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("NUMBER not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("NUMBER between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("NUMBER not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andEnabledEqualTo(Byte value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Byte value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Byte value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Byte value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Byte> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Byte> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Byte value1, Byte value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
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
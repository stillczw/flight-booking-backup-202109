package org.czw.flight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirplaneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirplaneExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andAirplaneIdIsNull() {
            addCriterion("airplane_id is null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIsNotNull() {
            addCriterion("airplane_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdEqualTo(String value) {
            addCriterion("airplane_id =", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotEqualTo(String value) {
            addCriterion("airplane_id <>", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThan(String value) {
            addCriterion("airplane_id >", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThanOrEqualTo(String value) {
            addCriterion("airplane_id >=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThan(String value) {
            addCriterion("airplane_id <", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThanOrEqualTo(String value) {
            addCriterion("airplane_id <=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLike(String value) {
            addCriterion("airplane_id like", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotLike(String value) {
            addCriterion("airplane_id not like", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIn(List<String> values) {
            addCriterion("airplane_id in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotIn(List<String> values) {
            addCriterion("airplane_id not in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdBetween(String value1, String value2) {
            addCriterion("airplane_id between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotBetween(String value1, String value2) {
            addCriterion("airplane_id not between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdIsNull() {
            addCriterion("airline_id is null");
            return (Criteria) this;
        }

        public Criteria andAirlineIdIsNotNull() {
            addCriterion("airline_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirlineIdEqualTo(Integer value) {
            addCriterion("airline_id =", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdNotEqualTo(Integer value) {
            addCriterion("airline_id <>", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdGreaterThan(Integer value) {
            addCriterion("airline_id >", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airline_id >=", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdLessThan(Integer value) {
            addCriterion("airline_id <", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("airline_id <=", value, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdIn(List<Integer> values) {
            addCriterion("airline_id in", values, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdNotIn(List<Integer> values) {
            addCriterion("airline_id not in", values, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdBetween(Integer value1, Integer value2) {
            addCriterion("airline_id between", value1, value2, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airline_id not between", value1, value2, "airlineId");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeIsNull() {
            addCriterion("airplane_type is null");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeIsNotNull() {
            addCriterion("airplane_type is not null");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeEqualTo(String value) {
            addCriterion("airplane_type =", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeNotEqualTo(String value) {
            addCriterion("airplane_type <>", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeGreaterThan(String value) {
            addCriterion("airplane_type >", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("airplane_type >=", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeLessThan(String value) {
            addCriterion("airplane_type <", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeLessThanOrEqualTo(String value) {
            addCriterion("airplane_type <=", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeLike(String value) {
            addCriterion("airplane_type like", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeNotLike(String value) {
            addCriterion("airplane_type not like", value, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeIn(List<String> values) {
            addCriterion("airplane_type in", values, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeNotIn(List<String> values) {
            addCriterion("airplane_type not in", values, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeBetween(String value1, String value2) {
            addCriterion("airplane_type between", value1, value2, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andAirplaneTypeNotBetween(String value1, String value2) {
            addCriterion("airplane_type not between", value1, value2, "airplaneType");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaIsNull() {
            addCriterion("first_class_quota is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaIsNotNull() {
            addCriterion("first_class_quota is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaEqualTo(Integer value) {
            addCriterion("first_class_quota =", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaNotEqualTo(Integer value) {
            addCriterion("first_class_quota <>", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaGreaterThan(Integer value) {
            addCriterion("first_class_quota >", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_class_quota >=", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaLessThan(Integer value) {
            addCriterion("first_class_quota <", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("first_class_quota <=", value, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaIn(List<Integer> values) {
            addCriterion("first_class_quota in", values, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaNotIn(List<Integer> values) {
            addCriterion("first_class_quota not in", values, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaBetween(Integer value1, Integer value2) {
            addCriterion("first_class_quota between", value1, value2, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andFirstClassQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("first_class_quota not between", value1, value2, "firstClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaIsNull() {
            addCriterion("economy_class_quota is null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaIsNotNull() {
            addCriterion("economy_class_quota is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaEqualTo(Integer value) {
            addCriterion("economy_class_quota =", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaNotEqualTo(Integer value) {
            addCriterion("economy_class_quota <>", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaGreaterThan(Integer value) {
            addCriterion("economy_class_quota >", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("economy_class_quota >=", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaLessThan(Integer value) {
            addCriterion("economy_class_quota <", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("economy_class_quota <=", value, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaIn(List<Integer> values) {
            addCriterion("economy_class_quota in", values, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaNotIn(List<Integer> values) {
            addCriterion("economy_class_quota not in", values, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaBetween(Integer value1, Integer value2) {
            addCriterion("economy_class_quota between", value1, value2, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andEconomyClassQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("economy_class_quota not between", value1, value2, "economyClassQuota");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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
package org.czw.flight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andFlightIdIsNull() {
            addCriterion("flight_id is null");
            return (Criteria) this;
        }

        public Criteria andFlightIdIsNotNull() {
            addCriterion("flight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlightIdEqualTo(String value) {
            addCriterion("flight_id =", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotEqualTo(String value) {
            addCriterion("flight_id <>", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThan(String value) {
            addCriterion("flight_id >", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThanOrEqualTo(String value) {
            addCriterion("flight_id >=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThan(String value) {
            addCriterion("flight_id <", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThanOrEqualTo(String value) {
            addCriterion("flight_id <=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLike(String value) {
            addCriterion("flight_id like", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotLike(String value) {
            addCriterion("flight_id not like", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdIn(List<String> values) {
            addCriterion("flight_id in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotIn(List<String> values) {
            addCriterion("flight_id not in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdBetween(String value1, String value2) {
            addCriterion("flight_id between", value1, value2, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotBetween(String value1, String value2) {
            addCriterion("flight_id not between", value1, value2, "flightId");
            return (Criteria) this;
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceIsNull() {
            addCriterion("first_class_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceIsNotNull() {
            addCriterion("first_class_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceEqualTo(Double value) {
            addCriterion("first_class_price =", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceNotEqualTo(Double value) {
            addCriterion("first_class_price <>", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceGreaterThan(Double value) {
            addCriterion("first_class_price >", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("first_class_price >=", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceLessThan(Double value) {
            addCriterion("first_class_price <", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceLessThanOrEqualTo(Double value) {
            addCriterion("first_class_price <=", value, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceIn(List<Double> values) {
            addCriterion("first_class_price in", values, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceNotIn(List<Double> values) {
            addCriterion("first_class_price not in", values, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceBetween(Double value1, Double value2) {
            addCriterion("first_class_price between", value1, value2, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andFirstClassPriceNotBetween(Double value1, Double value2) {
            addCriterion("first_class_price not between", value1, value2, "firstClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceIsNull() {
            addCriterion("economy_class_price is null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceIsNotNull() {
            addCriterion("economy_class_price is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceEqualTo(Double value) {
            addCriterion("economy_class_price =", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceNotEqualTo(Double value) {
            addCriterion("economy_class_price <>", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceGreaterThan(Double value) {
            addCriterion("economy_class_price >", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("economy_class_price >=", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceLessThan(Double value) {
            addCriterion("economy_class_price <", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceLessThanOrEqualTo(Double value) {
            addCriterion("economy_class_price <=", value, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceIn(List<Double> values) {
            addCriterion("economy_class_price in", values, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceNotIn(List<Double> values) {
            addCriterion("economy_class_price not in", values, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceBetween(Double value1, Double value2) {
            addCriterion("economy_class_price between", value1, value2, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andEconomyClassPriceNotBetween(Double value1, Double value2) {
            addCriterion("economy_class_price not between", value1, value2, "economyClassPrice");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(Date value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        // added
        public Criteria andDepartureTimeEqualTo(String value) {
            addCriterion("date_format(departure_time,'%Y-%m-%d') =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLike(String value) {
            addCriterion("departure_time like", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(Date value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(Date value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(Date value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(Date value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<Date> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<Date> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(Date value1, Date value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(Date value1, Date value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeIsNull() {
            addCriterion("landing_time is null");
            return (Criteria) this;
        }

        public Criteria andLandingTimeIsNotNull() {
            addCriterion("landing_time is not null");
            return (Criteria) this;
        }

        public Criteria andLandingTimeEqualTo(Date value) {
            addCriterion("landing_time =", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeNotEqualTo(Date value) {
            addCriterion("landing_time <>", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeGreaterThan(Date value) {
            addCriterion("landing_time >", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("landing_time >=", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeLessThan(Date value) {
            addCriterion("landing_time <", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeLessThanOrEqualTo(Date value) {
            addCriterion("landing_time <=", value, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeIn(List<Date> values) {
            addCriterion("landing_time in", values, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeNotIn(List<Date> values) {
            addCriterion("landing_time not in", values, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeBetween(Date value1, Date value2) {
            addCriterion("landing_time between", value1, value2, "landingTime");
            return (Criteria) this;
        }

        public Criteria andLandingTimeNotBetween(Date value1, Date value2) {
            addCriterion("landing_time not between", value1, value2, "landingTime");
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

package org.czw.flight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RouteExample() {
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

        public Criteria andDepartureAirportIsNull() {
            addCriterion("departure_airport is null");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportIsNotNull() {
            addCriterion("departure_airport is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportEqualTo(String value) {
            addCriterion("departure_airport =", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportNotEqualTo(String value) {
            addCriterion("departure_airport <>", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportGreaterThan(String value) {
            addCriterion("departure_airport >", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportGreaterThanOrEqualTo(String value) {
            addCriterion("departure_airport >=", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportLessThan(String value) {
            addCriterion("departure_airport <", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportLessThanOrEqualTo(String value) {
            addCriterion("departure_airport <=", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportLike(String value) {
            addCriterion("departure_airport like", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportNotLike(String value) {
            addCriterion("departure_airport not like", value, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportIn(List<String> values) {
            addCriterion("departure_airport in", values, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportNotIn(List<String> values) {
            addCriterion("departure_airport not in", values, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportBetween(String value1, String value2) {
            addCriterion("departure_airport between", value1, value2, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andDepartureAirportNotBetween(String value1, String value2) {
            addCriterion("departure_airport not between", value1, value2, "departureAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportIsNull() {
            addCriterion("landing_airport is null");
            return (Criteria) this;
        }

        public Criteria andLandingAirportIsNotNull() {
            addCriterion("landing_airport is not null");
            return (Criteria) this;
        }

        public Criteria andLandingAirportEqualTo(String value) {
            addCriterion("landing_airport =", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportNotEqualTo(String value) {
            addCriterion("landing_airport <>", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportGreaterThan(String value) {
            addCriterion("landing_airport >", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportGreaterThanOrEqualTo(String value) {
            addCriterion("landing_airport >=", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportLessThan(String value) {
            addCriterion("landing_airport <", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportLessThanOrEqualTo(String value) {
            addCriterion("landing_airport <=", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportLike(String value) {
            addCriterion("landing_airport like", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportNotLike(String value) {
            addCriterion("landing_airport not like", value, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportIn(List<String> values) {
            addCriterion("landing_airport in", values, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportNotIn(List<String> values) {
            addCriterion("landing_airport not in", values, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportBetween(String value1, String value2) {
            addCriterion("landing_airport between", value1, value2, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andLandingAirportNotBetween(String value1, String value2) {
            addCriterion("landing_airport not between", value1, value2, "landingAirport");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Integer value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Integer value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Integer value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Integer value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Integer value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Integer> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Integer> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Integer value1, Integer value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
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
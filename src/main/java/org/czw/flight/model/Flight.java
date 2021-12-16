package org.czw.flight.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Flight {
    private String flightId;

    private String airplaneId;

    private Integer routeId;

    private Double firstClassPrice;

    private Double economyClassPrice;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "en_GB")
    private Date departureTime;

    private Date landingTime;

    private Date addTime;

    private Date updateTime;

    private Boolean isDeleted;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId == null ? null : flightId.trim();
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId == null ? null : airplaneId.trim();
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Double getFirstClassPrice() {
        return firstClassPrice;
    }

    public void setFirstClassPrice(Double firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

    public Double getEconomyClassPrice() {
        return economyClassPrice;
    }

    public void setEconomyClassPrice(Double economyClassPrice) {
        this.economyClassPrice = economyClassPrice;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(Date landingTime) {
        this.landingTime = landingTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", airplaneId='" + airplaneId + '\'' +
                ", routeId=" + routeId +
                ", firstClassPrice=" + firstClassPrice +
                ", economyClassPrice=" + economyClassPrice +
                ", departureTime=" + departureTime +
                ", landingTime=" + landingTime +
                ", addTime=" + addTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}

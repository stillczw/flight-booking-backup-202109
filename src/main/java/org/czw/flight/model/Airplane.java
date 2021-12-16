package org.czw.flight.model;

import java.util.Date;

public class Airplane {
    private String airplaneId;

    private Integer airlineId;

    private String airplaneType;

    private Integer firstClassQuota;

    private Integer economyClassQuota;

    private Date addTime;

    private Date updateTime;

    private Boolean isDeleted;

    public String getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId == null ? null : airplaneId.trim();
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType == null ? null : airplaneType.trim();
    }

    public Integer getFirstClassQuota() {
        return firstClassQuota;
    }

    public void setFirstClassQuota(Integer firstClassQuota) {
        this.firstClassQuota = firstClassQuota;
    }

    public Integer getEconomyClassQuota() {
        return economyClassQuota;
    }

    public void setEconomyClassQuota(Integer economyClassQuota) {
        this.economyClassQuota = economyClassQuota;
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
}
package org.czw.flight.model;

import java.util.Date;

public class Ticket {
    private String bookingReference;

    private Integer userId;

    private String flightNumber;

    private String passengerName;

    private String classLevel;

    private Double price;

    private Date addTime;

    private Date updateTime;

    private Boolean isDeleted;

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference == null ? null : bookingReference.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName == null ? null : passengerName.trim();
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel == null ? null : classLevel.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        return "Ticket{" +
                "bookingReference='" + bookingReference + '\'' +
                ", userId=" + userId +
                ", flightNumber='" + flightNumber + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", classLevel='" + classLevel + '\'' +
                ", price=" + price +
                ", addTime=" + addTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}

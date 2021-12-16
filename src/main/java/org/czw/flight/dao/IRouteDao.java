package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.czw.flight.model.Route;

import java.util.List;
import java.util.Map;

public interface IRouteDao {

    @Insert("INSERT INTO route(airline_id,mileage,departure_airport,landing_airport)VALUES(#{airlineId},#{mileage},#{departure},#{landing})")
    public boolean doCreate(Route routeVo);

    @Select("SELECT route_id,mileage,departure_airport,landing_airport FROM route WHERE airline_id=#{airlineId} LIMIT #{start},#{lineSize}")
    public List<Route> findAllBySplit(Map<String, Object> params);
    @Select("SELECT COUNT(airline_id) FROM route WHERE airline_id=#{airlineId}")
    public Integer getAllCount(Map<String, Object> params);
    @Update("UPDATE route SET landing_airport=#{landing},departure_airport=#{departure},mileage=#{mileage} WHERE route_id=#{routeId}")
    public boolean doUpdate(Map<String, Object> result);
    @Select("SELECT route_id,mileage,departure_airport,landing_airport FROM route WHERE airline_id=#{airlineId} ")
    public List<Route> findAllByRid(Map<String, Object> params);
}

package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.czw.flight.model.Flight;

import java.util.List;
import java.util.Map;


public interface IFlightDao {

    @Insert("INSERT INTO flights(rid,comid,fprice,eprice,pla_number,firstdate)VALUES(#{rid},#{comid},#{fprice},#{eprice},#{pla_number},#{firstdate})")
    public boolean doCreate(Flight vo);

    @Select("SELECT number,rid,comid,fprice,eprice,pla_number,firstdate FROM flights WHERE comid=#{comid} LIMIT #{start},#{lineSize}")
    public List<Flight> findAllBySplit(Map<String, Object> params);

    @Select("SELECT COUNT(number) FROM flights WHERE comid=#{comid}")
    public Integer getAllCount(Map<String, Object> params);

    @Select("SELECT number,rid,comid,fprice,eprice,pla_number,firstdate FROM flights WHERE rid IN(SELECT rid FROM route WHERE take=#{take} AND land=#{land})")
    public List<Flight> findAll(Map<String, Object> map);

    @Select("SELECT  number,rid,comid,fprice,eprice,pla_number,firstdate FROM flights WHERE number=#{number}")
    public Flight findById(Integer number);
}

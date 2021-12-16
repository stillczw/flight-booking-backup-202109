package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.czw.flight.model.Airline;

import java.util.List;

public interface IAirlineDao {
    @Select("SELECT airline_id,name,contact_number FROM airline WHERE airline_id=#{airline_id}")
    public Airline findById(Integer airline_id);

    @Insert("INSERT INTO Airline(name,contact_number)VALUES(#{name},#{contact_number})")
    public boolean doCreate(Airline airlineVo);
    @Select("SELECT airline_id,name,contact_number FROM Airline WHERE airline_id <> 1")
    public List<Airline> findAll();
}

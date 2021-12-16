package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.czw.flight.model.Airplane;

import java.util.List;
import java.util.Map;

public interface IAirplaneDao {
    // to be fixed
    @Insert("INSERT INTO plane(airplane_id,status,first_class,economy,airline_id,type)VALUES(#{airplane_id},#{status},#{first_class},#{economy},#{airlineId},#{type})")
    public boolean doCreate(Airplane vo);

    @Select("SELECT airplane_id,status,first_class,economy,com_number,type FROM plane WHERE com_number=#{com_number} LIMIT #{start},#{lineSize}")
    public List<Airplane> findAllBySplit(Map<String, Object> params);
    @Select("SELECT COUNT(airline_id) FROM plane WHERE airline_id=#{airlineId}")
    public Integer getAllCount(Map<String, Object> params);
    @Update("UPDATE airplane SET status=#{status},first_class=#{first_class},economy=#{economy} WHERE airplane_id=#{airplaneId}")
    public boolean doUpdate(Map<String, Object> result);
    @Select("SELECT airplane_id,status,first_class,economy,airline_id,type FROM airplane WHERE airline_id=#{airlineId}")
    public List<Airplane> findAllByNumber(Map<String, Object> params);
}

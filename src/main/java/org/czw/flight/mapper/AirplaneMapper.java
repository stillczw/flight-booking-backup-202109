package org.czw.flight.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.czw.flight.model.Airplane;
import org.czw.flight.model.AirplaneExample;

public interface AirplaneMapper {
    long countByExample(AirplaneExample example);

    int deleteByExample(AirplaneExample example);

    int deleteByPrimaryKey(String airplaneId);

    int insert(Airplane record);

    int insertSelective(Airplane record);

    List<Airplane> selectByExample(AirplaneExample example);

    Airplane selectByPrimaryKey(String airplaneId);

    int updateByExampleSelective(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByExample(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByPrimaryKeySelective(Airplane record);

    int updateByPrimaryKey(Airplane record);
}
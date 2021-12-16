package org.czw.flight.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.czw.flight.model.Airline;
import org.czw.flight.model.AirlineExample;

public interface AirlineMapper {
    long countByExample(AirlineExample example);

    int deleteByExample(AirlineExample example);

    int deleteByPrimaryKey(Integer airlineId);

    int insert(Airline record);

    int insertSelective(Airline record);

    List<Airline> selectByExample(AirlineExample example);

    Airline selectByPrimaryKey(Integer airlineId);

    int updateByExampleSelective(@Param("record") Airline record, @Param("example") AirlineExample example);

    int updateByExample(@Param("record") Airline record, @Param("example") AirlineExample example);

    int updateByPrimaryKeySelective(Airline record);

    int updateByPrimaryKey(Airline record);
}
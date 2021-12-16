package org.czw.flight.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.czw.flight.model.Ticket;

import java.util.List;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/18 13:41
 */
public interface ITicketDao {
    @Insert("INSERT INTO ticket(booking_reference,user_id,flight_number,passenger_name,class_level,price,is_deleted) VALUES(#{bookingReference},#{userId},#{flightNumber},#{passengerName},#{classLevel},#{price},false)")
    public boolean doCreate(Ticket ticketVo);

    // to be modified
    @Select("SELECT booking_reference,user_id,passenger_name,class_level,flight_number,landdate,price FROM ticket WHERE passenger_name=#{name}")
    public List<Ticket> findAll(String name);

    @Select("SELECT booking_reference,user_id,passenger_name,class_level,flight_number,landdate,price FROM ticket WHERE flight_number=#{flightNumber}")
    public List<Ticket> findAllByFliNumber(String fli_number);
}

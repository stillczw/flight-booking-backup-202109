package org.czw.flight.service.front;

import org.czw.flight.model.Flight;
import org.czw.flight.model.Route;
import org.czw.flight.model.Ticket;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/12 18:50
 */
public interface TicketServiceFront {
    List<Flight> listFlights(String departure, String landing, Date start) throws ParseException;

    Flight getFlight(String airplaneId);

    boolean addTicket(Ticket ticketVo);

    List<Ticket> list(String username);

    List<Ticket> listA(String fli_number);
}

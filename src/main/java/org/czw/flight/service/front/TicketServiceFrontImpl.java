package org.czw.flight.service.front;

import org.czw.flight.dao.ITicketDao;
import org.czw.flight.mapper.FlightMapper;
import org.czw.flight.mapper.RouteMapper;
import org.czw.flight.mapper.TicketMapper;
import org.czw.flight.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/12 18:51
 */
@Service
public class TicketServiceFrontImpl implements TicketServiceFront {

    @Autowired
    TicketMapper ticketMapper;

    @Autowired
    RouteMapper routeMapper;

    @Autowired
    FlightMapper flightMapper;

    @Autowired
    ITicketDao ticketDao;

    @Override
    public List<Flight> listFlights(String departure, String landing, Date start){
        RouteExample routeExample = new RouteExample();
        routeExample.createCriteria().andDepartureAirportLike(departure).andLandingAirportEqualTo(landing);
        List<Route> routeList = routeMapper.selectByExample(routeExample);

        // transfer date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(start);

        FlightExample flightExample = new FlightExample();
        List<Flight> flightList = new ArrayList<>();

        for (Route route: routeList) {
            int routeId = route.getRouteId();
            // select the flights of specific route and departure time is suitable
            flightExample.createCriteria().andRouteIdEqualTo(routeId).andDepartureTimeEqualTo(date).andIsDeletedEqualTo(false);
//            flightExample.createCriteria().andRouteIdEqualTo(routeId).andDepartureTimeLike(date).andIsDeletedEqualTo(false);
//            flightExample.createCriteria().andRouteIdEqualTo(routeId).andDepartureTimeGreaterThanOrEqualTo(new Date()).andIsDeletedEqualTo(false);
            System.out.println(start);
            flightList.addAll(flightMapper.selectByExample(flightExample));
        }
        return flightList;
    }

    @Override
    public Flight getFlight(String airplaneId) {
        FlightExample flightExample = new FlightExample();
//        flightExample.createCriteria().andFlightIdEqualTo(airplaneId);
        flightExample.createCriteria().andAirplaneIdEqualTo(airplaneId).andIsDeletedEqualTo(false);
        return flightMapper.selectByExample(flightExample).get(0);
    }

    @Override
    public boolean addTicket(Ticket ticketVo) {
        /*FlightExample flightExample = new FlightExample();
        flightExample.createCriteria().andFlightIdEqualTo(ticketVo.getFlightNumber()).andIsDeletedEqualTo(false);
        List<Flight> flightList = flightMapper.selectByExample(flightExample);
        Flight flight = flightList.get(0);
        System.out.println(flight);
        if ("economy_class".equals(ticketVo.getClassLevel())) {
            ticketVo.setClassLevel("economy_class");
            ticketVo.setPrice(flight.getEconomyClassPrice());
            System.out.println(ticketVo);
        } else if ("first_class".equals(ticketVo.getClassLevel())) {
            ticketVo.setClassLevel("first_class");
            ticketVo.setPrice(flight.getFirstClassPrice());
        } else {
            return false;
        }
        ticketVo.setAddTime(new Date());
        ticketVo.setUpdateTime(new Date());
        ticketVo.setIsDeleted(false);

        return ticketMapper.insert(ticketVo) == 1;*/
        return this.ticketDao.doCreate(ticketVo);
    }

    @Override
    public List<Ticket> list(String username) {
        return this.ticketDao.findAll(username);
    }

    @Override
    public List<Ticket> listA(String fli_number) {
        return this.ticketDao.findAllByFliNumber(fli_number);
    }
}

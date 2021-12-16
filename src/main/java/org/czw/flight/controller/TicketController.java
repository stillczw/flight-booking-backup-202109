package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.czw.flight.model.Ticket;
import org.czw.flight.model.User;
import org.czw.flight.service.front.TicketServiceFront;
import org.czw.flight.utils.DefaultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/12 18:42
 */
@Controller
@RequestMapping("ticket")
public class TicketController extends DefaultController {
    @Resource
    TicketServiceFront ticketServiceFront;

    @RequestMapping("show")
    public void show(String departure, String landing, Date start, HttpServletResponse response) throws ParseException {
        super.print(JSONObject.toJSONString(ticketServiceFront.listFlights(departure, landing, start), SerializerFeature.WriteDateUseDateFormat), response);
    }
    // todo for autocomplete search
    @RequestMapping("search")
    public void search(String departure, String landing, HttpServletResponse response) {
//        super.print(JSONObject.toJSONString(ticketServiceFront.getDepartureAirport(departure, landing), SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("book")
    public void book(String airplaneId, HttpServletResponse response) {
        super.print(JSONObject.toJSONString(ticketServiceFront.getFlight(airplaneId), SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("add")
    public void add(String classLevel, Double price, String flightNumber, HttpServletResponse response, HttpServletRequest request) {
//        System.out.println(request);
        Ticket ticketVo = new Ticket();
        ticketVo.setClassLevel(classLevel);
        ticketVo.setPrice(price);
        ticketVo.setFlightNumber(flightNumber);
        User user = (User) request.getSession().getAttribute("users");
//        System.out.println(user);
        ticketVo.setUserId(user.getUserId());
        ticketVo.setPassengerName(user.getNickname());
        ticketVo.setBookingReference(UUID.randomUUID().toString().replace("-", "").substring(0,8));
//        System.out.println(ticketVo);
        if (ticketServiceFront.addTicket(ticketVo)) {
            super.print("successful", response);
        } else {
            super.print("fail", response);
        }
    }

    @RequestMapping("list")
    public void list(HttpServletResponse response, HttpServletRequest request) {
        User users = (User) request.getSession().getAttribute("users");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data",this.ticketServiceFront.list(users.getUsername()));
        map.put("count", 100);
        super.print(JSONObject.toJSONString(map, SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("listA")
    public void listA(String flightNumber,HttpServletResponse response, HttpServletRequest request) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data",this.ticketServiceFront.listA(flightNumber));
        map.put("count", 100);
        super.print(JSONObject.toJSONString(map, SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("get")
    public void get(String flightId, HttpServletResponse response) {
        super.print(JSONObject.toJSONString(this.ticketServiceFront.getFlight(flightId), SerializerFeature.WriteDateUseDateFormat), response);
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

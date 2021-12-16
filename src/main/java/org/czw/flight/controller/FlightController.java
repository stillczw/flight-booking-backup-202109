package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.model.Admin;
import org.czw.flight.model.Flight;
import org.czw.flight.service.back.FlightServiceBackend;
import org.czw.flight.utils.DefaultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/pages/back/admin/flights/FlightsController/*")
public class FlightController extends DefaultController {

    @Resource
    private FlightServiceBackend flightServiceBackend;

    @RequestMapping("listSplit")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:list")
    public void listSplit(HttpServletResponse response, HttpServletRequest request) {
        int currentPage = 1;
        int lineSize = 10;
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        Map<String, Object> map = this.flightServiceBackend.listSplit(admin.getLoginId(), currentPage, lineSize);
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data", map.get("data"));
        map.put("count", map.get("count"));
        super.print(JSONObject.toJSONString(map, SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("add")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("flights:add")
    public void add(Flight vo, HttpServletResponse response, HttpServletRequest request) {
        if (this.flightServiceBackend.add(vo)) {
            super.print("success", response);
        } else {
            super.print("fail", response);
        }
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

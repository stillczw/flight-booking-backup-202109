package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.model.Admin;
import org.czw.flight.model.Route;
import org.czw.flight.service.back.RouteServiceBackend;
import org.czw.flight.utils.DefaultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/pages/back/admin/route/RouteController/*")
public class RouteController extends DefaultController {

    @Resource
    private RouteServiceBackend routeServiceBackend;

    @RequestMapping("list")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:list")
    public void list(HttpServletResponse response, HttpServletRequest request) {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        super.print(JSONObject.toJSONString(this.routeServiceBackend.listByRid(admin.getLoginId())), response);
    }

    @RequestMapping("update")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:update")
    public void update(Route routeVo, HttpServletResponse response, HttpServletRequest request) {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        routeVo.setAirlineId(admin.getLoginId());// get the airline_id
        if (this.routeServiceBackend.update(routeVo)) {
            super.print("success", response);
        } else {
            super.print("fail", response);
        }
    }

    @RequestMapping("listSplit")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:list")
    public void listSplit(HttpServletResponse response, HttpServletRequest request) {
        int currentPage = 1;
        int lineSize = 10;
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        Map<String, Object> map = this.routeServiceBackend.listSplit(admin.getLoginId(), currentPage, lineSize);
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data", map.get("data"));
        map.put("count", map.get("count"));
        super.print(JSONObject.toJSONString(map), response);
    }

    @RequestMapping("add")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("route:add")
    public void add(Route routeVo, HttpServletResponse response, HttpServletRequest request) {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        routeVo.setAirlineId(admin.getLoginId());
        if (this.routeServiceBackend.add(routeVo)) {
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

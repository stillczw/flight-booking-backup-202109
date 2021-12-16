package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.model.Admin;
import org.czw.flight.model.Airline;
import org.czw.flight.service.back.AirlineServiceBackend;
import org.czw.flight.utils.DefaultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/pages/back/admin/company/CompanyController/*")
public class AirlineController extends DefaultController {

    @Resource
    private AirlineServiceBackend airlineServiceBackend;

    @RequestMapping("list")
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("company:list")
    public void list(HttpServletResponse response) {
       Map<String,Object> map = new HashMap<>();
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data", this.airlineServiceBackend.list());
        map.put("count", 1000);
        super.print(JSONObject.toJSONString(map), response);
    }

    @RequestMapping("listA")
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("company:list")
    public void listA(HttpServletResponse response) {
        super.print(JSONObject.toJSONString(this.airlineServiceBackend.list()), response);
    }
    @RequestMapping("add")
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("company:add")
    public void add(Airline vo, HttpServletResponse response) {
        if(this.airlineServiceBackend.add(vo)){
            super.print("success",response);
        }else{
            super.print("fail",response);
        }
    }

    @RequestMapping("show")
    public void show(HttpServletResponse response, HttpServletRequest request){
        Admin adminVo = (Admin) request.getSession().getAttribute("admin");
        Airline airline = this.airlineServiceBackend.show(adminVo.getLoginId());
        super.print(JSONObject.toJSONString(airline),response);
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

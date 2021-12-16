package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.czw.flight.model.Admin;
import org.czw.flight.model.Airplane;
import org.czw.flight.service.back.AirplaneServiceBackend;
import org.czw.flight.utils.DefaultController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/pages/back/admin/plane/PlaneController/*")
public class AirplaneController extends DefaultController {

    @Resource
    private AirplaneServiceBackend airplaneServiceBackend;

    @RequestMapping("list")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:list")
    public void list(HttpServletResponse response, HttpServletRequest request) {
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        super.print(JSONObject.toJSONString(this.airplaneServiceBackend.listByNumber(admin.getLoginId())), response);
    }

    @RequestMapping("update")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:update")
    public void update(Airplane vo, HttpServletResponse response, HttpServletRequest request) {
        if (this.airplaneServiceBackend.update(vo)) {
            super.print("success", response);
        } else {
            super.print("fail", response);
        }
    }

    @RequestMapping("listSplit")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:list")
    public void listSplit(HttpServletResponse response, HttpServletRequest request) {
        int currentPage = 1;
        int lineSize = 10;
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        Map<String, Object> map = this.airplaneServiceBackend.listSplit(admin.getLoginId(), currentPage, lineSize);
        map.put("msg", "loading");
        map.put("code", 0);
        map.put("data", map.get("data"));
        map.put("count", map.get("count"));
        super.print(JSONObject.toJSONString(map), response);
    }

    // todo
    @RequestMapping("add")
    @RequiresUser
    @RequiresRoles("generalAdmin")
    @RequiresPermissions("airplane:add")
    public void add(Airplane vo, Integer firstClass, HttpServletRequest request, HttpServletResponse response) {
        /*Admin admin = (Admin) request.getSession().getAttribute("admin");
        vo.setCom_number(admin.getNumber());// get the id of specific airlines
        vo.setFirst_class(firstClass);
        vo.setNumber(UUID.randomUUID().toString().replace("-", "").substring(5, 10));
        if (this.planeServiceBack.add(vo)) {
            super.print("success", response);
        } else {
            super.print("fail", response);
        }*/
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

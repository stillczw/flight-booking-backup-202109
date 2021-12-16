package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import org.czw.flight.service.back.RoleServiceBackend;
import org.czw.flight.utils.DefaultController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/pages/back/admin/role/RoleController/*")
public class RoleController extends DefaultController {

    @Resource
    private RoleServiceBackend roleServiceBackend;

    @RequestMapping("list")
    public void list(HttpServletResponse response){
        super.print(JSONObject.toJSONString(this.roleServiceBackend.list()),response);
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

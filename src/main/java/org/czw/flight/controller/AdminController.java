package org.czw.flight.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.czw.flight.service.back.AdminServiceBackend;

import org.czw.flight.utils.DefaultController;
import org.czw.flight.utils.md5.Md5Utils;
import org.czw.flight.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/13 16:16
 */
@Controller
//@RequestMapping("/AdminController/*")
@RequestMapping("admin")
public class AdminController extends DefaultController {

    @Resource
    AdminServiceBackend adminServiceBackend;

    @RequestMapping("login")
    public void login(Admin adminVO, HttpServletResponse response) {
        UsernamePasswordToken token = new UsernamePasswordToken(adminVO.getUsername(), adminVO.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            response.getWriter().print("successful");
        } catch (Exception e) {
            try {
                response.getWriter().print("fail");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    // todo
    @RequestMapping("logout")
    public void logout(HttpServletResponse response, HttpServletRequest request){
        request.getSession().invalidate();
        try {
//            request.getRequestDispatcher("/WEB-INF/pages/back/index.jsp").forward(request,response);
            request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        /*Subject subject = SecurityUtils.getSubject();
        subject.logout();
        response.setHeader("X-Flight-Users-Token", "");*/
    }

    @RequestMapping("update")
    @RequiresUser
    @RequiresRoles("superAdmin")
    public void update(Admin adminVo, HttpServletResponse response, HttpServletRequest request, MultipartFile file) {
        adminVo.setPassword(Md5Utils.getMd5(adminVo.getPassword(), "2590312")); // 默认密码是123456
        String fileName = super.createFileName(file);
        adminVo.setPhoto(fileName);
        if (this.adminServiceBackend.update(adminVo)) {
            super.saveFile(file, fileName, request);
            super.print(0, response);
        } else {
            super.print(1, response);
        }
    }

    @RequestMapping("list")
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("admin:list")
    public void list(Admin vo, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "加载中");
        map.put("code", 0);
        map.put("data", this.adminServiceBackend.list());
        map.put("count", 1000);
        super.print(JSONObject.toJSONString(map, SerializerFeature.WriteDateUseDateFormat), response);
    }

    @RequestMapping("add")
    @RequiresUser
    @RequiresRoles("superAdmin")
    @RequiresPermissions("admin:add")
    public void add(Admin adminVo, HttpServletResponse response, HttpServletRequest request) {
        Set<Integer> set = new HashSet<Integer>();
        String result[] = request.getParameterValues("rid");
        for (int x = 0; x < result.length; x++) {
            set.add(Integer.parseInt(result[x])); // 取得rid信息
        }
        adminVo.setPassword(Md5Utils.getMd5(adminVo.getPassword(), "2590312")); // 默认密码是123456
        if (this.adminServiceBackend.add(adminVo, set)) {
            super.print("success", response);
        } else {
            super.print("fail", response);
        }
    }

    @Override
    public String getFilePath() {
        return File.separator + "WEB-INF" + File.separator + "static" + File.separator + "upload" + File.separator + "admin" + File.separator;
    }

}

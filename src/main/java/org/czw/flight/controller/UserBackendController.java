package org.czw.flight.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.czw.flight.service.back.AdminServiceBackend;
import org.czw.flight.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/8 23:23
 */
@RestController
//@RequestMapping("/UserController/*")
@RequestMapping("user")
public class UserBackendController {

    @Autowired
    AdminServiceBackend adminServiceBackend;

    @RequestMapping("login")
    public void login(User userVo, HttpServletResponse response) {
        UsernamePasswordToken token = new UsernamePasswordToken(userVo.getUsername(), userVo.getPassword());
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


}

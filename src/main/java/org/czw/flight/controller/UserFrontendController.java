package org.czw.flight.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.czw.flight.service.front.UserServiceFront;
import org.czw.flight.model.User;
import org.czw.flight.utils.DefaultController;
import org.czw.flight.utils.md5.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author zhiwei_CHEN
 * @date 2021/11/3 0:51
 */
@Controller
@RequestMapping("users")
public class UserFrontendController extends DefaultController {

    @Autowired
    UserServiceFront userServiceFront;

    @RequestMapping("reg")
    @ResponseBody
    public void register(User userVo, HttpServletResponse response) {
        // encrypt the password with a salt using md5
        userVo.setPassword(Md5Utils.getMd5(userVo.getPassword(), "2590312"));
        if (userServiceFront.addUser(userVo)) {
            super.print("successful", response);
        } else {
            super.print("fail", response);
        }
    }

    @RequestMapping("login")
    public void login(User userVo, HttpServletRequest request, HttpServletResponse response) {
        userVo.setPassword(Md5Utils.getMd5(userVo.getPassword(), "2590312"));
        User user = null;
        if (userServiceFront.getUser(userVo) != null) {
            user = userServiceFront.getUser(userVo);
        }

//        System.out.println(user.getPassword());
        if (user != null && user.getUsername() != null) {
            request.getSession().setAttribute("users", user);
//            System.out.println(request);
            super.print("successful", response);
        } else {
            super.print("fail", response);
        }

    }

    @RequestMapping("update")
    public void update(User userVo, HttpServletResponse response) {
        userVo.setPassword(Md5Utils.getMd5(userVo.getPassword(), "2590312"));

        if (userServiceFront.updateUser(userVo)) {
            super.print("successful", response);
        } else {
            super.print("fail", response);
        }
    }

    @RequestMapping("logout")
    public void logout(HttpServletResponse response,HttpServletRequest request){
        request.getSession().invalidate();
        try {
            request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        /*Subject subject = SecurityUtils.getSubject();
        subject.logout();
        response.setHeader("X-Flight-Users-Token", "");*/
    }

    @Override
    public String getFilePath() {
        return null;
    }
}

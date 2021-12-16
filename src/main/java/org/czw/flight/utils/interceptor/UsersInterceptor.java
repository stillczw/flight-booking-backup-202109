package org.czw.flight.utils.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UsersInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest req = request;
        HttpSession ses = req.getSession();
        if (ses.getAttribute("users") != null) {
            return true;
        } else {
            req.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
        }
        return false;
    }
}

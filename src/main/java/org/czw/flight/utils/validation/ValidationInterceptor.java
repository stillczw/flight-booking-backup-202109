package org.czw.flight.utils.validation;

import org.springframework.context.MessageSource;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class ValidationInterceptor implements HandlerInterceptor {
    @Resource
    private MessageSource messageSource;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 定义标志位
        boolean flag = true; // 默认对所有的数据进行放行
        try {
            HandlerMethod method = (HandlerMethod) handler;
            // 拼凑验证规则 （例如：AdminLoginAction.login.rules）
            String validateKey = method.getBean().getClass().getSimpleName() + "." + method.getMethod().getName() + ".rules";
            // 通过验证规则取得验证内容
            String validateValue = null;
            try {
                validateValue = this.messageSource.getMessage(validateKey, null, Locale.getDefault());
                if (validateValue != null) {
                    String result[] = validateValue.split("\\|");
                    for (int x = 0; x < result.length; x++) {
                        String temp[] = result[x].split(":");
                        String paramName = temp[0];
                        String paramValue = request.getParameter(paramName);
                          System.out.println(paramName + "=" + paramValue);
                        switch (temp[1]) {
                            case "string": {
                                if (!ValidationUtils.isString(paramValue)) {
                                    flag = false;
                                }
                                break;
                            }
                            case "int": {
                                if (!ValidationUtils.isInt(paramValue)) {
                                    flag = false;
                                }
                                break;
                            }
                            case "double": {
                                if (!ValidationUtils.isDouble(paramValue)) {
                                    flag = false;
                                }
                                break;
                            }
                            case "date": {
                                if (!ValidationUtils.isDate(paramValue)) {
                                    flag = false;
                                }
                                break;
                            }
                        }
                    }
                    if (flag == false) {
                        response.getWriter().print("isEmpty");
                    }
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

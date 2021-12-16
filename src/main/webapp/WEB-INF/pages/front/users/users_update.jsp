<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Flight Booking System</title>
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css"/>
    <script src="https://lib.baomitu.com/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://www.layuicdn.com/layui/layui.js"></script>
    <script src="<%=basePath%>js/users/update.js"></script>
</head>
<body>
<div class="layui-container">
    <%--  top navigation  --%>
    <jsp:include page="/WEB-INF/pages/plugins/front-top1.jsp"/>
    <div class="layui-col-md4">&nbsp;</div>
    <div class="layui-col-md4">
        <form class="layui-form">
            <div class="layui-form-item">
                <label class="layui-form-label">nickname</label>
                <div class="layui-input-block">
                    <input type="text" name="nickname" required lay-verify="required"
                           placeholder="Please enter nickname"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">password</label>
                <div class="layui-input-block">
                    <input type="password" name="password" required lay-verify="required"
                           placeholder="Please enter password"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">telephone</label>
                <div class="layui-input-block">
                    <input type="text" name="phoneNumber" required lay-verify="required"
                           placeholder="Please enter phone number"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <input type="hidden" name="username"value="${users.username}">
                    <input type="button"
                           class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4"
                           lay-filter="submitBtn" value="Modify" lay-submit>
                    <button type="reset" class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                </div>
            </div>
        </form>
    </div>
    <div class="layui-col-md4">&nbsp;</div>
</div>
<script>
    layui.use(['element', 'carousel'], function () {
        var element = layui.element, carousel = layui.carousel;

    });
</script>
</body>
</html>

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
    <script src="<%=basePath%>js/ticket/list.js"></script>
</head>
<body>
<div class="layui-container">
    <%--    top navigator    --%>
    <jsp:include page="/WEB-INF/pages/plugins/front-top2.jsp"/>
    <div class="layui-col-md12">
        <div class="layui-col-md3">
            Ticket Information
        </div>
        <div class="layui-col-md9">
            <table class="layui-table" lay-filter="listSplit"></table>
        </div>
    </div>
</div>
<script>
    layui.use(['element', 'carousel'], function () {
        var element = layui.element, carousel = layui.carousel;

    });
</script>
</body>
</html>

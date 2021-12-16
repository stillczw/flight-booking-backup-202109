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
    <script src="<%=basePath%>js/ticket/show.js"></script>
    <%--<script src="<%=basePath%>js/search.js"></script>--%>
</head>
<body>
<div class="layui-container">
    <%--    top navigator    --%>
    <jsp:include page="/WEB-INF/pages/plugins/front-top2.jsp"/>
    <div class="layui-col-md12" id="search">
        <div class="layui-col-md3">Flight from: <input type="text" name="departure" id="departureAirport" class="layui-input" value="London">
            Flight to: <input type="text" name="landing" id="landingAirport" class="layui-input" value="Shanghai">
            <%--<div class="layui-inline">--%>
                <input type="text" name="start" id="start" class="layui-input" placeholder="date"/>
            <%--</div>--%>
            <button class="layui-btn layui-btn-danger" id="submitBtn">SEARCH</button>
        </div>
    </div>
        <div class="layui-col-md12">
            <br>
                <div id="ticket"></div>
            <br>
        </div>
    <div class="layui-col-md12">
        <br><br>
        <table class="layui-table" id="list">
            <tr>
                <td>Flight Number</td>
                <td>First Class</td>
                <td>Economy Class</td>
                <td>Departure Date</td>
                <td>Arrival Date</td>
                <td>Operation</td>
            </tr>
        </table>
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

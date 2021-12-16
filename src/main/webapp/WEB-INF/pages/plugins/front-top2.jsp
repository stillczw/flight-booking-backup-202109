<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-col-md12">
    <ul class="layui-nav" lay-filter="">
        <li class="layui-nav-item layui-col-md-offset1"><a href="<%=basePath%>index.html">Activities</a></li>
        <li class="layui-nav-item layui-this"><a href="<%=basePath%>ticket/showUrl.html">Booking</a></li>
        <%--<li class="layui-nav-item"><a href="<%=basePath%>pages/front/ticket/TicketController/showUrl.html">Booking</a></li>--%>
    </ul>
    <ul class="layui-nav layui-layout-right">
        <c:if test="${users == null}">
            <li class="layui-nav-item">
                <a href="<%=basePath%>index.html">
                    Log in
                </a>
            </li>
            <li class="layui-nav-item"><a href="<%=basePath%>index.html">Register</a></li>
        </c:if>
        <c:if test="${users!= null}">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="<%=basePath%>upload/admin/photo1.jpg" class="layui-nav-img">
                    ${users.nickname}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="<%=basePath%>users/updateUrl.html">My Profile</a></dd>
                    <dd><a href="<%=basePath%>ticket/list.html">My Trips</a></dd>
                    <%--<dd><a href="<%=basePath%>pages/front/ticket/TicketController/listUrl.html">My Trips</a></dd>--%>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="<%=basePath%>users/logout.html">Log out</a></li>
            <%--<li class="layui-nav-item"><a href="<%=basePath%>UserLoginController/logOut.html">Log out</a></li>--%>
        </c:if>
    </ul>
</div>
<div class="layui-col-md12"><br><br></div>

<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="layui-header">
    <div class="layui-logo">Backend Management</div>
    <!-- top -->
    <ul class="layui-nav layui-layout-left">
<%--        <li class="layui-nav-item"><a href="">控制台</a></li>--%>
<%--        <li class="layui-nav-item"><a href="">商品管理</a></li>--%>
<%--        <li class="layui-nav-item"><a href="">用户</a></li>--%>
<%--        <li class="layui-nav-item">--%>
<%--            <a href="javascript:;">其它系统</a>--%>
<%--            <dl class="layui-nav-child">--%>
<%--                <dd><a href="">邮件管理</a></dd>--%>
<%--                <dd><a href="">消息管理</a></dd>--%>
<%--                <dd><a href="">授权管理</a></dd>--%>
<%--            </dl>--%>
<%--        </li>--%>
    </ul>
    <ul class="layui-nav layui-layout-right">
        <li class="layui-nav-item">
            <a href="javascript:;">
                <img src="<%=basePath%>upload/admin/${admin.photo}" class="layui-nav-img">
                <shiro:principal></shiro:principal>
            </a>
            <dl class="layui-nav-child">
                <dd><a href="<%=basePath%>pages/back/admin/AdminController/updateUrl.html">Update Profile</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="<%=basePath%>admin/logout.html">Log out</a></li>
    </ul>
</div>

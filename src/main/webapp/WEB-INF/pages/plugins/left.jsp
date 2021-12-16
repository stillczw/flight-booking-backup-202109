<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
        <!-- left -->
        <ul class="layui-nav layui-nav-tree" lay-filter="test">
            <shiro:hasRole name="superAdmin">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">Admin</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/add">Add Admin</a></dd>
                        <dd><a href="<%=basePath%>admin/list">List Admin</a></dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="superAdmin">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">User</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/user/list">List User</a></dd>
                        <dd><a href="<%=basePath%>admin/order/list">List Order</a></dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="superAdmin">
                <li class="layui-nav-item">
                    <a href="javascript:;">Airline</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/airline/add">Add Airline</a>
                        </dd>
                        <dd><a href="<%=basePath%>admin/airline/list">List Airline</a>
                        </dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="generalAdmin">
                <li class="layui-nav-item">
                    <a href="javascript:;">Route</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/route/add">Add Route</a></dd>
                        <dd><a href="<%=basePath%>admin/route/list">List Route</a></dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="generalAdmin">
                <li class="layui-nav-item">
                    <a href="javascript:;">Airplane</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/plane/add">Add Airplane</a></dd>
                        <dd><a href="<%=basePath%>admin/plane/list">List Airplane</a></dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="generalAdmin">
                <li class="layui-nav-item">
                    <a href="javascript:;">Flight</a>
                    <dl class="layui-nav-child">
                        <dd><a href="<%=basePath%>admin/flight/add">Add Flight</a></dd>
                        <dd><a href="<%=basePath%>admin/flight/list">List Flight</a></dd>
                    </dl>
                </li>
            </shiro:hasRole>
            <shiro:hasRole name="superAdmin">
                <li class="layui-nav-item"><a href="<%=basePath%>admin/log/list">Check Log</a></li>
            </shiro:hasRole>
            <li class="layui-nav-item"><a href="<%=basePath%>admin/update">Update Admin</a></li>
        </ul>
    </div>
</div>

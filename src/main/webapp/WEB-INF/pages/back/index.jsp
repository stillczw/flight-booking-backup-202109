<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Backend Management System</title>
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css"/>
    <script src="https://lib.baomitu.com/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://www.layuicdn.com/layui/layui.js"></script>
    <script src="<%=basePath%>js/index.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <jsp:include page="/WEB-INF/pages/plugins/top.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/pages/plugins/left.jsp"></jsp:include>
    <div class="layui-body">
        <!-- basic content -->
        <div style="padding: 15px;">
            <br><br><br>
            <div class="layui-col-md12" style="font-size: 25px" id="title"></div>
            <%--<br><br><br>--%>
            <%--<div class="layui-col-md12">
                <div class="layui-carousel" id="test1">
                    <div carousel-item>
                        <div style="background-color: rebeccapurple">1</div>
                        <div style="background-color: yellowgreen">2</div>
                        <div style="background-color: brown">3</div>
                        <div style="background-color: green">4</div>
                        <div style="background-color: antiquewhite">5</div>
                    </div>
                </div>
            </div>--%>
            <%--<br><br><br> <br><br><br>--%>
            <div class="layui-col-md12">
            This is the home page of the flight booking backend management system<br>
            </div>
            <br><br><br><br><br><br>
            <shiro:hasRole name="superAdmin">
                <div class="layui-col-md12">
                    Only super admins can see these pages</div><br><br><br>
                <div class="layui-col-md12">
                    <div class="layui-col-md6">
                        <div class="layui-card">
                            <div class="layui-card-header">Admin Management</div>
                            <div class="layui-card-body">
                                You can manage admin information and check the logs
                            </div>
                        </div>
                    </div>
                    <div class="layui-col-md6">
                        <div class="layui-card">
                            <div class="layui-card-header">User Management</div>
                            <div class="layui-card-body">
                                You can list all user information, including accounts and orders
                            </div>
                        </div>
                    </div>
                </div>
            </shiro:hasRole>
            <shiro:hasRole name="generalAdmin">
                Only general admins of specific airlines can see these pages<br><br><br>
                <div class="layui-col-md12">
                    <div class="layui-col-md6">
                        <div class="layui-card">
                            <div class="layui-card-header">Flight Management</div>
                            <div class="layui-card-body">
                                You can add or update flights of your own company
                            </div>
                        </div>
                    </div>
                    <div class="layui-col-md6">
                        <div class="layui-card">
                            <div class="layui-card-header">Route Management</div>
                            <div class="layui-card-body">

                            </div>
                        </div>
                    </div>

                </div>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">Airplane Management</div>
                        <div class="layui-card-body">

                        </div>
                    </div>
                </div>
            </shiro:hasRole>
        </div>
    </div>
    <jsp:include page="/WEB-INF/pages/plugins/footer.jsp"></jsp:include>
</div>
<script>
    //JavaScript代码区域
    layui.use(['element', 'carousel'], function () {
        var element = layui.element, carousel = layui.carousel;
        carousel.render({
            elem: '#test1'
            , width: '100%',//设置容器宽度
            height: '350px'
            , arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
</script>
</body>
</html>

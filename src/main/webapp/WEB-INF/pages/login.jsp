<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Admin Login</title>
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css"/>
    <script src="https://lib.baomitu.com/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://www.layuicdn.com/layui/layui.js"></script>
    <script src="<%=basePath%>js/login.js"></script>
    <style>
        h1{
            text-align: center;
            font-size: 25px;
            padding-bottom: 20px;
            color: white;
        }
        body{background-image: url("/flight/img/logo1.jpg")}
        .layui-col-md4{padding-top: 320px;}
        .layui-form-label{color: white}
    </style>
</head>
<body>
<div class="layui-container">
    <div class="layui-col-md6">&nbsp;</div>
    <div class="layui-col-md4">
        <h1 class="layui-col-md-offset3">Admin Login</h1>
        <form class="layui-form">
            <div class="layui-form-item">
                <label class="layui-form-label">username</label>
                <div class="layui-input-block">
                    <input type="text" name="username" required lay-verify="required" placeholder="please enter username"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">password</label>
                <div class="layui-input-block">
                    <input type="password" name="password" required lay-verify="required" placeholder="PASSWORD"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4" lay-filter="submitBtn" value="login" lay-submit>
                    <button type="reset"  class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                </div>
            </div>
        </form>
    </div>
    <div class="layui-col-md2">&nbsp;</div>
</div>
</body>
</html>

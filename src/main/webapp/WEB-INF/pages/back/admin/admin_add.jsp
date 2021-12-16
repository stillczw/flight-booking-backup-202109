<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <script src="<%=basePath%>js/role/list.js"></script>
    <script src="<%=basePath%>js/admin/add.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <jsp:include page="/WEB-INF/pages/plugins/top.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/pages/plugins/left.jsp"></jsp:include>
    <div class="layui-body">
        <div style="padding: 15px;">
            <div class="layui-container">
                <form class="layui-form">
                    <div class="layui-form-item">
                        <label class="layui-form-label">Username</label>
                        <div class="layui-input-block">
                            <input type="text" name="aid" required lay-verify="required"
                                   placeholder="username"
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Name</label>
                        <div class="layui-input-block">
                            <input type="text" name="name" required lay-verify="required"
                                   placeholder="nickname"
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Airline ID</label>
                        <div class="layui-input-block">
                           <select name="number" id="number">
                           </select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Role ID</label>
                        <div class="layui-input-block">
                            <div id="rid">
                            </div>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4"
                                   lay-filter="submitBtn" value="add" lay-submit>
                            <button type="reset" class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/pages/plugins/footer.jsp"></jsp:include>
</div>
<script>
    layui.use(['element', 'form', 'laydate'], function () {
        var element = layui.element, form = layui.form;
        var laydate = layui.laydate;

        laydate.render({
            elem: '#firstdate'
            , type: 'datetime'
        });

    });
</script>
</body>
</html>

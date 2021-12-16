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
    <script src="<%=basePath%>js/plane/add.js"></script>
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
                        <label class="layui-form-label">Type</label>
                        <div class="layui-input-block">
                            <select name="type" lay-verify="required">
                                <option value="A380-B">A380-B</option>
                                <option value="A380-A">A380-A</option>
                                <option value="A380-C">A380-C</option>
                                <option value="B479-A">B479-A</option>
                                <option value="B479-B">B479-B</option>
                                <option value="B479-C">B479-C</option>
                            </select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">First Class Quota</label>
                        <div class="layui-input-block">
                            <input type="text" name="firstClass" required lay-verify="required|number" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Economy Class Quota</label>
                        <div class="layui-input-block">
                            <input type="text" name="economy" required lay-verify="required|number" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Status</label>
                        <div class="layui-input-block">
                            <input type="radio" name="status" value="1" title="normal" checked>
                            <input type="radio" name="status" value="2" title="maintenance">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4" lay-filter="submitBtn" value="添加" lay-submit>
                            <button type="reset"  class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/pages/plugins/footer.jsp"></jsp:include>
</div>
<script>
    //JavaScript代码区域
    layui.use(['element','form'], function () {
        var element = layui.element,form=layui.form;

    });
</script>
</body>
</html>

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
    <script src="<%=basePath%>js/route/add.js"></script>
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
                        <label class="layui-form-label">Departure Airport</label>
                        <div class="layui-input-block">
                            <input type="text" name="take" required lay-verify="required" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Landing Airport</label>
                        <div class="layui-input-block">
                            <input type="text" name="land" required lay-verify="required" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Mileage</label>
                        <div class="layui-input-block">
                            <input type="text" name="mileage" required lay-verify="required|number" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4" lay-filter="submitBtn" value="add" lay-submit>
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
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</body>
</html>

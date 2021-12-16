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
    <script src="<%=basePath%>js/flights/show.js"></script>
    <script src="<%=basePath%>js/flights/add.js"></script>
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
                        <label class="layui-form-label">Airplane ID</label>
                        <div class="layui-input-block">
                            <select name="pla_number" id="pla_number"></select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Route ID</label>
                        <div class="layui-input-block">
                            <select name="rid" id="rid"></select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">First Class Price</label>
                        <div class="layui-input-block">
                            <input type="text" name="fprice" required lay-verify="required|number"
                                   placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Economy Class Price</label>
                        <div class="layui-input-block">
                            <input type="text" name="eprice" required lay-verify="required|number"
                                   placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">Departure Date</label>
                        <div class="layui-input-block">
                            <input type="text" name="firstdate" id="firstdate" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <input type="hidden" name="comid" value="${admin.login_id}">
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

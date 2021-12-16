<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css"/>
    <script src="https://lib.baomitu.com/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://www.layuicdn.com/layui/layui.js"></script>
    <script src="<%=basePath%>js/users/reg.js"></script>
    <script src="<%=basePath%>js/users/login.js"></script>
    <title>Flight Booking System</title>

</head>
<body>
<div class="layui-container">
    <%--    navigation --%>
    <jsp:include page="plugins/front-top1.jsp"/>
    <div class="layui-col-md8">
        <div class="layui-carousel" id="test1">
            <div carousel-item>
                <div><img src="<%=basePath%>img/1.jpg" alt="" style="width: 860px;height: 300px;"></div>
                <div><img src="<%=basePath%>img/2.png" alt=""></div>
                <div><img src="<%=basePath%>img/3.png" alt=""></div>
                <div><img src="<%=basePath%>img/4.jpg" alt=""></div>
                <div><img src="<%=basePath%>img/5.jpg" alt=""></div>
            </div>
        </div>
    </div>
    <div class="layui-col-md4">
        <c:if test="${users == null}">
            <div class="layui-tab">
                <ul class="layui-tab-title">
                    <li class="layui-this">Log in</li>
                    <li>Sign up</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <form class="layui-form" id="login">
                            <div class="layui-form-item">
                                <label class="layui-form-label">username</label>
                                <div class="layui-input-block">
                                    <input type="text" name="username" required lay-verify="required"
                                           placeholder="Please enter the username"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">password</label>
                                <div class="layui-input-block">
                                    <input type="password" name="password" required lay-verify="required"
                                           placeholder="PASSWORD"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <input type="button"
                                           class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4"
                                           lay-filter="formBtn" value="login" lay-submit>
                                    <button type="reset" class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="layui-tab-item">
                        <form class="layui-form" id="reg">
                            <div class="layui-form-item">
                                <label class="layui-form-label">username</label>
                                <div class="layui-input-block">
                                    <input type="text" name="username" required lay-verify="required"
                                           placeholder="Please enter username"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">nickname</label>
                                <div class="layui-input-block">
                                    <input type="text" name="nickname" required lay-verify="required" placeholder="Please enter your name"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">password</label>
                                <div class="layui-input-block">
                                    <input type="password" name="password" required lay-verify="required"
                                           placeholder="PASSWORD"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">telephone number</label>
                                <div class="layui-input-block">
                                    <input type="text" name="phoneNumber" required lay-verify="required" placeholder="Please enter tel-number"
                                           autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <input type="button"
                                           class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4"
                                           lay-filter="submitBtn" value="register" lay-submit>
                                    <button type="reset" class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </c:if>
        <c:if test="${users != null}">
           <div class="layui-col-md-offset1" style="color: green;font-size: 25px;"> Welcome, ${users.nickname} </div>
        </c:if>
    </div>
    <div class="layui-col-md12"><br><br></div>
    <div class="layui-col-md6">
        <div class="layui-card">
            <div class="layui-card-header">Information</div>
            <div class="layui-card-body">
                <ol type="1">
                    <li>1. The default announcement content is the departure delay and cancellation information of flights with the departure date within three days before the change.</li>
                    <li>2. When the flight is delayed/cancelled, and other relevant requirements are met, the certificate of abnormal flight can be obtained.</li>
                    <li>3. All dates and times should be local time.</li>
                    <li>4. The announcement only shows the actual flights carried by specific airlines.</li>
                    <li>5. Flight departure delay and cancellation information changes dynamically, please update and query in time.</li>
                </ol>

            </div>
        </div>
    </div>

    <div class="layui-col-md6">
        <div class="layui-card">
            <div class="layui-card-header">Notice</div>
            <div class="layui-card-body">
                Dear passengers,
                In order to facilitate you to select the actual flight to be transported by Beijing Airlines,
                we hereby announce that the specific flight will be transported by Beijing airlines since October 31, 2021:
                <ul>
                    <li>CA8623</li>
                    <li>CA8617</li>
                    <li>CA8651</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<script>
    layui.use(['element', 'carousel'], function () {
        var element = layui.element, carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            , width: '100%' //设置容器宽度
            , arrow: 'always' //始终显示箭头
        });
    });
</script>
</body>
</html>

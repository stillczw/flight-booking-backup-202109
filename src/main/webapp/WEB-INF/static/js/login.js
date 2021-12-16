$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        form.on('submit(submitBtn)', function (obj) {
            $.ajax({
                url: '/flight/admin/login.html',
                type: 'POST',
                data: $('.layui-form').serialize(),
                success: function (data) {
                    if (data == "successful") {
                        layer.msg('Log in successfully, redirect to the backend homepage...', {
                            time: 1000, icon: 1, end: function () {
                                // window.location.href = "/flight/pages/back/admin/AdminController/indexUrl.html";
                                window.location.href = "/flight/admin/index.html";
                            }
                        });
                    } else if (data == "isEmpty") {
                        layer.msg('Data cannot be null!', {time: 1000, icon: 2});
                    } else {
                        layer.msg('Invalid username or password', {time: 1000, icon: 2});
                    }
                }
            })
        })
    })
})

$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        form.on('submit(formBtn)', function (obj) {
            $.ajax({
                // url: '/flight/UserController/login.html',
                url: '/flight/users/login.html',
                type: 'POST',
                data: $('#login').serialize(),
                success: function (data) {
                    if (data == "successful") {
                        layer.msg('Log in successfully, welcome!', {
                            time: 1000, icon: 1, end: function () {
                                window.location.href="/flight";
                            }
                        });
                    } else if (data == "isEmpty") {
                        layer.msg('Data cannot be empty', {time: 1000, icon: 2});
                    } else {
                        layer.msg('Wrong username or password', {time: 1000, icon: 2});
                    }
                }
            })
        })
    })
})

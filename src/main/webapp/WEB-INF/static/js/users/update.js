$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        form.on('submit(submitBtn)', function (obj) {
            $.ajax({
                url: '/flight/users/update.html',
                type: 'POST',
                data: $('.layui-form').serialize(),
                success: function (data) {
                    if (data == "successful") {
                        layer.msg('Modified successfully, redirect to the homepage...', {
                            time: 1000, icon: 1, end: function () {
                                window.location.href="/flight/users/logout.html";
                            }
                        });
                    } else if (data == "isEmpty") {
                        layer.msg('Data cannot be empty!', {time: 1000, icon: 2});
                    } else {
                        layer.msg('Invalid nickname, password or telephone number', {time: 1000, icon: 2});
                    }
                }
            })
        })
    })
})

$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        form.on('submit(submitBtn)', function (obj) {
            $.ajax({
                url: '/flight/users/reg.html',
                type: 'POST',
                data: $('#reg').serialize(),
                success: function (data) {
                    if (data == "successful") {
                        layer.msg('Registered successfully, please log in', {
                            time: 1000, icon: 1, end: function () {
                                window.location.reload();
                            }
                        });
                    } else if (data == "isEmpty") {
                        layer.msg('Data cannot be empty!', {time: 1000, icon: 2});
                    } else {
                        layer.msg('Invalid username, password or telephone number', {time: 1000, icon: 2});
                    }
                }
            })
        })
    })
})

$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        form.on('submit(submitBtn)', function (obj) {
            $.ajax({
                url: '/flight/pages/back/admin/company/CompanyController/add.html',
                type: 'POST',
                data: $('.layui-form').serialize(),
                success: function (data) {
                    if (data == "success") {
                        layer.msg('Added successfully!', {
                            time: 1000, icon: 1, end: function () {
                                window.location.href = "/flight/pages/back/admin/company/CompanyController/addUrl.html";
                            }
                        });
                    } else if (data == "isEmpty") {
                        layer.msg('Data cannot be null!', {time: 1000, icon: 2});
                    } else {
                        layer.msg('Failed!', {time: 1000, icon: 2});
                    }
                }
            })
        })
    })
})

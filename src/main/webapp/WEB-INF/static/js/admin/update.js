$(function () {
    layui.use(['upload', 'layer', 'jquery'], function () {
        var upload = layui.upload, layer = layui.layer, $ = layui.jquery;
        upload.render({
            elem: '#upload',
            url: '/flight/pages/back/admin/AdminController/update.html',
            size: 300, // files uploaded cannot be greater than 300kb
            auto: false, // manually
            accept: 'images',
            acceptMime: 'image/*',
            bindAction: '#formBtn',
            before: function (obj) {
                this.data = {
                    name: $('input[name="name"]').val(),
                    password: $('input[name="password"]').val(),
                    aid: $('input[name="aid"]').val()
                }
            },
            choose: function (obj) {
                obj.preview(function (index, file, result) {
                    $('#photo').attr('style', 'width:280px');
                    $('#photo').attr('src', result);
                })
            },
            done: function (obj) {
                if (obj == 0) {
                    layer.msg('Updated successfully!', {
                        time: 1000, icon: 1, end: function () {
                            window.location.href = "/flight/pages/back/admin/AdminController/logOut.html";
                        }
                    });
                } else {
                    layer.msg('Failed!', {time: 1000, icon: 2});
                }
            }
        })
    })
})

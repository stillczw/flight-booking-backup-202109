$(function () {
    layui.use(['form', 'layer', 'jquery'], function () {
        var form = layui.form, layer = layui.layer, $ = layui.jquery;
        $.post('/flight/pages/back/admin/route/RouteController/list.html', {}, function (obj) {
            for (var x = 0; x < obj.length; x++) {
                $('#rid').append("<option value='" + obj[x].rid + "'>" + obj[x].take + " ==> " + obj[x].land + "</option>")
            }
            form.render();
        }, 'json')
        $.post('/flight/pages/back/admin/plane/PlaneController/list.html', {}, function (obj) {
            for (var x = 0; x < obj.length; x++) {
                $('#pla_number').append("<option value='" + obj[x].number + "'>" + obj[x].number + "</option>")
            }
            form.render();
        }, 'json')
    })
})
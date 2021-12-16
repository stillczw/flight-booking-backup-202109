$(function () {
    layui.use(['table', 'layer', 'jquery', 'form'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer, form = layui.form;
        $.post('/flight/pages/back/admin/company/CompanyController/listA.html', {}, function (obj) {
            for (var i = 0; i < obj.length; i++) {
                $('#number').append('<option value="' + obj[i].number + '">' + obj[i].title + '</option>');
            }
            form.render();
        }, 'json')

        $.post('/flight/pages/back/admin/role/RoleController/list.html', {}, function (obj) {
            for (var i = 0; i < obj.length; i++) {
                $('#rid').append('<input type="checkbox" class="layui-input" name="rid" title="'+obj[i].title+'" value="'+obj[1].rid+'">');
            }
            form.render();
        }, 'json')
    })
})
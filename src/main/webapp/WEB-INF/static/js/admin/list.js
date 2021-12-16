$(function () {
    layui.use(['table', 'layer', 'jquery','form'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer, form = layui.form;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/AdminController/list.html',
            cols: [[
                {field: 'aid', title: 'Username'},
                {field: 'name', title: 'Name'},
                {field: 'lastdate', title: 'Last Login Time'}
            ]]
        })
    })
})

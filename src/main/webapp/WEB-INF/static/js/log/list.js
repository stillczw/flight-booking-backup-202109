$(function () {
    layui.use(['table', 'layer', 'jquery', 'form'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer, form = layui.form;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/log/LogController/listSplit.html',
            page: true,
            limit: 10,
            cols: [[
                {field: 'aid', title: 'Username'},
                {field: 'ip', title: 'Login IP'},
                {field: 'lastdate', title: 'Last Login Time'}
            ]]
        })
    })
})

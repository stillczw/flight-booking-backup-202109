$(function () {
    layui.use(['table', 'layer', 'jquery','form'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer, form = layui.form;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/company/CompanyController/list.html',
            cols: [[
                {field: 'number', title: 'Airline ID'},
                {field: 'title', title: 'Airline Name'},
                {field: 'tel', title: 'Contact Number'}
            ]]
        })
    })
})

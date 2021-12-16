$(function () {
    layui.use(['table', 'layer', 'jquery'], function () {
        var table = layui.table, layer = layui.layer, $ = layui.jquery;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/front/ticket/TicketController/list.html',
            cols: [[
                {field: 'number', title: 'Booking Reference'},
                {field: 'name', title: 'Passenger Name'},
                {field: 'grade', title: 'Class Level'},
                {field: 'landdate', title: 'Departure Date'},
                {field: 'price', title: 'Price'},
            ]]
        })
    })
})

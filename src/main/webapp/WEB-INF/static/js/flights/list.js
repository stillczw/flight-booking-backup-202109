$(function () {
    layui.use(['table', 'layer', 'jquery'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/flights/FlightsController/listSplit.html',
            page: true,
            limit: 10,
            cols: [[
                {field: 'number', title: 'Flight Number'},
                {field: 'pla_number', title: 'Airplane ID'},
                {field: 'rid', title: 'Route ID'},
                {field: 'fprice', title: 'First Class Price'},
                {field: 'eprice', title: 'Economy Class Price'},
                {field: 'firstdate', title: 'Departure Date'},
                {field: 'right', title: 'Operation', templet: '#BarOption'}
            ]]
        })
        table.on('tool(listSplit)', function (obj) {
            var data = obj.data;
            if (obj.event == 'show') {
                var number = data.number;
                $.post('/flight//pages/back/admin/ticket/TicketBackController/list.html', {"fli_number": number}, function (obj) {
                    for (var x = 0; x < obj.length; x++) {
                        $('#show').append(
                            '<div style="font-size: 18px;color: red;padding-top: 15px">Ticket Information: </div><br><div>Booking Reference:' + obj[x].number + ' &nbsp;&nbsp;Buyer:' + obj[x].name +' &nbsp;&nbsp;Class Level:' + obj[x].grade + ' &nbsp;&nbsp;Price:' + obj[x].price + '</div><hr>'
                        );
                    }
                }, 'json')
            }
        })
    })
})

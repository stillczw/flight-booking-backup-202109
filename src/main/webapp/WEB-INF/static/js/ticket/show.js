$(function () {
    layui.use(['table', 'layer', 'jquery', 'laydate'], function () {
        var table = layui.table, layer = layui.layer, $ = layui.jquery, laydate = layui.laydate;
        // rendering a laydate entity
        laydate.render({
            elem: '#start' // elem: document.getElementById('test')、elem: lay('#test')
            // type: 'date' as default
            , lang: 'en'
        });
        $('#submitBtn').on('click', function () {
            var departure = $('#departureAirport').val();
            var landing = $('#landingAirport').val();
            var start = $('#start').val();
            if (departure != null && landing != null && start != null) {
                $.post('/flight/ticket/show.html', {
                    "departure": departure,
                    "landing": landing,
                    "start": start
                }, function (obj) {
                    for (var x = 0; x < obj.length; x++) {
                        // var flightId = obj[x].flightId;
                        var str = '<tr>' +
                            '<td>' + obj[x].flightId + '</td>' +
                            '<td>' + obj[x].firstClassPrice + '</td>' +
                            '<td>' + obj[x].economyClassPrice + '</td>' +
                            '<td>' + obj[x].departureTime + '</td>' +
                            '<td>' + obj[x].landingTime + '</td>' +
                            // '<td><a  onclick="show(' + flightId + ')" class="layui-btn layui-btn-xs layui-btn-danger">Book</a></td>' +
                            '<td><a  onclick="show(' + obj[x].airplaneId + ')" class="layui-btn layui-btn-xs layui-btn-danger">Book</a></td>' +
                            '</tr>';
                        $('#list').append(str);
                    }
                }, 'json')
            }
        })
    });
});

function show(airplaneId) {
    layui.use(['table', 'layer', 'jquery', 'form'], function () {
        var table = layui.table, layer = layui.layer, $ = layui.jquery, form = layui.form;
        $.post('/flight/ticket/book.html', {"airplaneId": airplaneId}, function (obj) {
            $('#ticket').append('<form class="layui-form"><div class="layui-col-md1">Flight:<input type="text" class="layui-input" name="flightId" value="' + obj.flightId + '" disabled></div>' +
                '<div class="layui-col-md3">Select Class:<select name="classLevel">' +
                '<option value="economy_class">Economy Class: ' + obj.economyClassPrice + '</option>' +
                '<option value="first_class">First Class: ' + obj.firstClassPrice + '</option>' +
                '</select></div>' +
                '<div class="layui-col-md3">Price: <select name="price">' +
                '<option value="' + obj.economyClassPrice + '"> ' + obj.economyClassPrice + '</option>' +
                '<option value="' + obj.firstClassPrice + '">' + obj.firstClassPrice + '</option>' +
                '</select></div>' +
                '<div class="layui-col-md2 layui-col-md-offset1">' +
                '<input type="hidden" value="' + obj.flightId + '" name="flightNumber">' +
                // '<input type="hidden" value="' + obj.departureTime + '" name="departureTime">' +
                '<input type="button" class="layui-btn layui-btn-danger" value="submit" lay-submit lay-filter="submitBtns">' +
                '</div>' +
                '</form>');
            form.on('submit(submitBtns)', function (obj) {
                $.ajax({
                    url: '/flight/ticket/add.html',
                    // url: '/flight/pages/front/ticket/TicketController/add.html',
                    type: 'POST',
                    data: $('.layui-form').serialize(),
                    success: function (data) {
                        if (data == "successful") {
                            layer.msg('Booking successfully', {
                                time: 1000, icon: 1, end: function () {
                                    window.location.href = "/flight/ticket/listUrl.html";
                                    // window.location.href = "/flight/pages/front/ticket/TicketController/listUrl.html";
                                }
                            });
                        } else if (data == "isEmpty") {
                            layer.msg('Data cannot be null!', {time: 1000, icon: 2});
                        } else {
                            layer.msg('Failure!', {time: 1000, icon: 2});
                        }
                    }
                })
            });
            form.render();
        }, 'json')
    })
}

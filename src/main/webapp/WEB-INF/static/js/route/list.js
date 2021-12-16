$(function () {
    layui.use(['table', 'layer', 'jquery'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/route/RouteController/listSplit.html',
            page: true,
            limit: 10,
            cols: [[
                {field: 'rid', title: 'Route ID'},
                {field: 'take', title: 'Departure Airport'},
                {field: 'land', title: 'Landing Airport'},
                {field: 'mileage', title: 'Mileage'},
                {field: 'right', title: 'Operation', templet: '#barOption'},
            ]]
        })
        table.on('tool(listSplit)', function (obj) {
            var data = obj.data;
            if (obj.event == 'edit') {
                var take = data.take;
                var rid = data.rid;
                var land = data.land;
                var mileage = data.mileage;
                layer.open({
                    type: 1,
                    shade: [0.8, '#a2a8bb'],
                    title: 'UpdateRoute',
                    area: ['500px', '300px'],
                    content: '<div class="layui-col-md10"><form class="layui-form" style="padding-top: 10px">' +
                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">Departure Airport</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="take" required lay-verify="required" placeholder=""\n' +
                        '                                   autocomplete="off" class="layui-input" value="'+take+'">' +
                        '</div>' +
                        '</div>' +
                        '' +

                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">Landing Airport</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="land" required lay-verify="required" placeholder=""\n' +
                        '                                   autocomplete="off" class="layui-input" value="'+land+'">' +
                        '</div>' +
                        '</div>' +

                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">Mileage</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="mileage" required lay-verify="required" placeholder=""\n' +
                        '                                   autocomplete="off" class="layui-input" value="'+mileage+'">' +
                        '</div>' +
                        '</div>' +
                        '' +

                        ' <div class="layui-form-item">' +
                        '<div class="layui-input-block">' +
                        '<input type="hidden" name="rid" value="'+rid+'">'+
                        '<input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4" id="editBtn" lay-filter="submitBtn" value="edit" lay-submit>\n' +
                        '<button type="reset"  class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>\n'+
                        '</div>' +
                        '</div>' +
                        '' +
                        '</form></div><div class="layui-col-md2">&nbsp;</div>',
                })
                $(function (){
                    $('#editBtn').on('click',function (){
                        $.ajax({
                            url: '/flight/pages/back/admin/route/RouteController/update.html',
                            type: 'POST',
                            data: $('.layui-form').serialize(),
                            success: function (data) {
                                if (data == "success") {
                                    layer.msg('Modified successfully!', {
                                        time: 1000, icon: 1, end: function () {
                                            window.location.href = "/flight/pages/back/admin/route/RouteController/listUrl.html";
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
            }
        })
    })
})

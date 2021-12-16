$(function () {
    layui.use(['table', 'layer', 'jquery','form'], function () {
        var table = layui.table, $ = layui.jquery, layer = layui.layer,form=layui.form;
        table.render({
            elem: '.layui-table',
            url: '/flight/pages/back/admin/plane/PlaneController/listSplit.html',
            page: true,
            limit: 10,
            cols: [[
                {field: 'number', title: 'Airplane ID'},
                {field: 'type', title: 'Type'},
                {field: 'first_class', title: 'First Class Quota'},
                {field: 'economy', title: 'Economy Class Quota'},
                {field: 'status', title: 'Status',templet:'#status'},
                {field: 'right', title: 'Operation', templet: '#barOption'},
            ]]
        })
        table.on('tool(listSplit)', function (obj) {
            var data = obj.data;
            if (obj.event == 'edit') {
                var first_class = data.first_class;
                var economy = data.economy;
                var status = data.status;
                var number = data.number;
                layer.open({
                    type: 1,
                    shade: [0.8, '#a2a8bb'],
                    title: 'UpdateRoute',
                    area: ['500px', '300px'],
                    content: '<div class="layui-col-md10"><form class="layui-form" style="padding-top: 10px">' +
                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">First Class Quota</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="first_class" required lay-verify="required" placeholder=""\n' +
                        '                                   autocomplete="off" class="layui-input" value="'+first_class+'">' +
                        '</div>' +
                        '</div>' +
                        '' +

                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">Economy Class Quota</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="economy" required lay-verify="required" placeholder=""\n' +
                        '                                   autocomplete="off" class="layui-input" value="'+economy+'">' +
                        '</div>' +
                        '</div>' +

                        ' <div class="layui-form-item">' +
                        ' <label class="layui-form-label">Status</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="radio" name="status" value="1" title="normal" checked>' +
                        '<input type="radio" name="status" value="2" title="maintenance">' +
                        '</div>' +
                        '</div>' +
                        '' +

                        ' <div class="layui-form-item">' +
                        '<div class="layui-input-block">' +
                        '<input type="hidden" name="number" value="'+number+'">'+
                        '<input type="button" class="layui-btn layui-btn-success layui-btn-xs layui-col-md-offset4" id="editBtn" lay-filter="submitBtn" value="edit" lay-submit>\n' +
                        '<button type="reset"  class="layui-btn layui-btn-danger layui-btn-xs">Reset</button>\n'+
                        '</div>' +
                        '</div>' +
                        '' +
                        '</form></div><div class="layui-col-md2">&nbsp;</div>',

                })
                form.render(); // rendering
                $(function (){
                    $('#editBtn').on('click',function (){
                        $.ajax({
                            url: '/flight/pages/back/admin/plane/PlaneController/update.html',
                            type: 'POST',
                            data: $('.layui-form').serialize(),
                            success: function (data) {
                                if (data == "success") {
                                    layer.msg('编辑成功！', {
                                        time: 1000, icon: 1, end: function () {
                                            window.location.href = "/flight/pages/back/admin/plane/PlaneController/listUrl.html";
                                        }
                                    });
                                } else if (data == "isEmpty") {
                                    layer.msg('数据不能为空！', {time: 1000, icon: 2});
                                } else {
                                    layer.msg('编辑失败!', {time: 1000, icon: 2});
                                }
                            }
                        })
                    })
                })
            }
        })
    })
})

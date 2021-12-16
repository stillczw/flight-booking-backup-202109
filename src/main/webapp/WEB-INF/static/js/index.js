$(function () {
    $.post('/flight/pages/back/admin/company/CompanyController/show.html', {}, function (obj) {
        $('#title').append('<div>公司名称：' + obj.title + ' &nbsp; &nbsp; &nbsp; &nbsp;  订票电话:' + obj.tel + '</div>')
    }, 'json')
})
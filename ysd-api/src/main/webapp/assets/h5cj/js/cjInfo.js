$(function () {
    /**
     * 获取url查询参数
     * @param string 要查询的url地址
     * @return String
     * */
    function getQueryString(str) {
        var strVal = location.search.match(new RegExp("[\?\&]"+str+"=([^\&]*)(\&?)","i"));
        return strVal ? strVal[1] : strVal;
    }

    /**
     *
     * @desc   判断是否为手机号
     * @param  {String|Number} str
     * @return {Boolean}
     */
    function isPhoneNum(str) {
        return /^(0|86|17951)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/.test(str)
    }

    var id = getQueryString('id');
    var cjCode = getQueryString('cjCode');
    var $name = $('input[name="name"]');
    var $iphone = $('input[name="iphone"]');
    var $address = $('textarea[name="address"]');

    // 提交信息
    $('#subBtn').click(function () {
        if(!id) return false;
        if(!$name.val()) {
            layer.open({
                content: '请输入姓名！'
                ,skin: 'msg'
                ,time: 2
            });
            return false;
        }
        if(!$iphone.val()) {
            layer.open({
                content: '请输入手机号码！'
                ,skin: 'msg'
                ,time: 2
            });
            return false;
        }
        if(!isPhoneNum($iphone.val())) {
            layer.open({
                content: '手机号码格式不正确！'
                ,skin: 'msg'
                ,time: 2
            });
            return false;
        }
        if(!$address.val()) {
            layer.open({
                content: '请输入收件地址！'
                ,skin: 'msg'
                ,time: 2
            });
            return false;
        }

        $.ajax({
            type: 'POST',
            url: '/rest/awardPeopleInfo/'+ cjCode +'&userId='+ id +'&name='+ $name.val() +'&phone='+ $iphone.val() +'&address='+ $address.val(),
            dataType: 'json',
            success: function (result) {
                if(result == 1) {
                    layer.open({
                        content: '填写保存成功！',
                        btn: '确定',
                        shadeClose: false,
                        yes: function(){
                            window.location.href = 'cj.ftl';
                        }
                    });
                } else {
                    layer.open({
                        content: '信息提交失败，请联系客服！'
                        ,btn: '我知道了'
                    });
                }
            }
        });
    });
});
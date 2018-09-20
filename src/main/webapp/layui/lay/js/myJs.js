layui.use(['element','layer'], function(){
    var $ = layui.$,
        layer=layui.layer;
    $(".refresh").on("click",function(){
            parent.tools.refresh();
    });

    $(".closed").on("click",function () {
        parent.tools.closed();
    });
});
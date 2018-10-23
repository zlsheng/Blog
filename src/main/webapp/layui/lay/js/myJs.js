layui.config({
    base: "${base}/layui/lay/modules/"
}).use(['element','layer'], function(){
    var $ = layui.$,
        layer=layui.layer;
    $(".refresh").on("click",function(){
            parent.tools.refresh();
    });

    $(".closed").on("click",function () {
        parent.tools.closed();
    });

    $(".closed_open").on("click",function closedView() {
        //alert("点击了关闭按钮");
        var index = parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    });

});
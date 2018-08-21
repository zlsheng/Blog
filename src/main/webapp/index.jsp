<%--<action name="*user" class="com.zzjmay.action.UserAction" method="{1}">--%>
    <%--//这种通配是针对的是同一个action中，响应不同的方法--%>

<%@ page contentType="text/html; charset=UTF-8"%>
    <%--在jsp页面中调用的时候--%>
    <form action="/test/login!test.do" method="post">
        <!-- 需要注意的是要保证表单中的name的命名要和Action中属性的命名保持一致 -->
        用户名：<input type="text" name="username" id="username"/><br>
        密&nbsp;&nbsp;码：<input type="password" name="password" id="password"/>
        <br>
        <input type="submit" value="提交"/>

    </form>
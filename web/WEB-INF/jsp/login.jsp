<%--
  Created by IntelliJ IDEA.
  User: 命运
  Date: 2018/11/01
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h2>商务会员管理系统</h2>
  <form action="${pageContext.request.contextPath}/use/loginIn" method="post">
      用户名：<input type="text" name="name"><br/>
      密码：<input type="password" name="password"/><br/>
      <input type="submit" value="登陆">
  </form>
  </body>
</html>

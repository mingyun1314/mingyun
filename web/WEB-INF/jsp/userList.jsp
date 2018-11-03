<%--
  Created by IntelliJ IDEA.
  User: 命运
  Date: 2018/11/02
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>商务会员管理系统</h2>
    用户名：${user.name }
    用户类型：${user.password}
    <<a href="">退出</a><br/>
    <a href="">
        <input type="text" name="username">
        <input type="button" value="查找">
    </a>
    <br/>
<table>
    <tr>序号 </tr>
    <tr>用户名 </tr>
    <tr>用户类别 </tr>
    <tr>用户状态 </tr>
    <tr>最后修改时间</tr>
   <%-- <c:forEach items="${userList}" var="">
    </c:forEach>--%>
</table>
</body>
</html>

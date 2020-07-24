<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/30
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mypro/AddUserServlet" method="post">
    <table>
        <tr>
            <td colspan="2">管理员注册</td>
        </tr>
        <tr>
            <td>账号：</td>
            <td><input name="uame" placeholder="请输入账号"><span style="color: red;">${requestScope.error_msg}</span></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="upsw" placeholder="请输入密码"></td>
        </tr>
        <tr>
            <td>真实姓名：</td>
            <td><input name="urealname" placeholder="请输入真实姓名"></td>
        </tr>
        <tr>
            <td colspan="2"><button>注册</button></td>
        </tr>
    </table>
</form>
</body>
</html>

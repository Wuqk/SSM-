<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<html>
<body>
<style>
    .tcent{
        text-align: center;
    }
</style>
<form action="/mypro/LoginServlet" method="post">
    <table>
        <tr>
            <td colspan="2" class="tcent">管理员登录</td>
        </tr>
        <tr>
            <td>账号：</td>
            <td><input name="uame" placeholder="请输入用户名"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="upsw" placeholder="请输入密码"></td>
        </tr>
        <tr>
            <td class="tcent"><button>登录</button></td>
            <td class="tcent"><a href="register.jsp"><input type="button" value="注册"></a></td>
        </tr>
    </table>
</form>
</body>
</html>

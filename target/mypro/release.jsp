<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/30
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mypro/DoReantalServlet" method="post">
    <table>
        <tr>
            <td colspan="2">发布出租管理信息</td>
        </tr>
        <tr>
            <td>所在区域：</td>
            <td><select name="harea" >
                <option value="武昌区" selected>武昌区</option>
                <option value="江夏区">江夏区</option>
                <option value="汉阳区">汉阳区</option>
                <option value="蔡甸区">蔡甸区</option>
                <option value="青山区">青山区</option>
                <option value=" 东西湖区">东西湖区</option>
            </select></td>
        </tr>
        <tr>
            <td>小区名称：</td>
            <td><input name="hname"></td>
        </tr>
        <tr>
            <td>房型：</td>
            <td><input name="hfx"></td>
        </tr>
        <tr>
            <td>房屋面积：</td>
            <td><input name="hmj"></td>
        </tr>
        <tr>
            <td>装修情况：</td>
            <td><input type="radio" name="hzx"value="毛坯" checked>毛坯
                <input type="radio" name="hzx"value="简装">简装
                <input type="radio" name="hzx"value="精装">精装

                </td>
        </tr>
        <tr>
            <td>楼层：</td>
            <td><input name="hlc"></td>
        </tr>
        <tr>
            <td>租金(￥)：</td>
            <td><input name="hzj"></td>
        </tr>
        <tr>
            <td>房东：</td>
            <td><input name="hfd"></td>
        </tr>
        <tr>
            <td>房东电话：</td>
            <td><input name="hfdtel"></td>
        </tr>
        <tr>
            <td>出租情况：</td>
            <td><input type="radio" value="未出租" name="hqk" checked>未出租
                <input type="radio" value="已出租" name="hqk">已出租</td>
        </tr>
        <tr>
            <td colspan="2"><button>确定</button></td>
        </tr>
    </table>
</form>
</body>
</html>

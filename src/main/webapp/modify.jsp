<%@ page import="com.yjsj.mypro.entity.House" %>
<%@ page import="com.yjsj.mypro.dao.house_Dao" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/30
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mypro/UpdateServlet" method="post">
    <table>
        <input type="hidden" name="hid" value="${requestScope.house.hid}">
        <tr>
            <td colspan="2">修改出租管理信息</td>
        </tr>
        <tr>
            <td>所在区域：</td>
            <td><select name="harea" >
                <option value="武昌区" <c:if test="${requestScope.house.harea eq '武昌区'}">selected</c:if>>武昌区</option>
                <option value="江夏区" <c:if test="${requestScope.house.harea eq '江夏区'}">selected</c:if>>江夏区</option>
                <option value="汉阳区" <c:if test="${requestScope.house.harea eq '汉阳区'}">selected</c:if>>汉阳区</option>
                <option value="蔡甸区" <c:if test="${requestScope.house.harea eq '蔡甸区'}">selected</c:if>>蔡甸区</option>
                <option value="青山区" <c:if test="${requestScope.house.harea eq '青山区'}">selected</c:if>>青山区</option>
                <option value="东西湖区" <c:if test="${requestScope.house.harea eq '东西湖区'}">selected</c:if>>东西湖区</option>
            </select></td>
        </tr>
        <tr>
            <td>小区名称：</td>
            <td><input name="hname" value="${requestScope.house.hname}"></td>
        </tr>
        <tr>
            <td>房型：</td>
            <td><input name="hfx" value="${requestScope.house.hfx}"></td>
        </tr>
        <tr>
            <td>房屋面积：</td>
            <td><input name="hmj" value="${requestScope.house.hmj}"></td>
        </tr>
        <tr>
            <td>装修情况：</td>
            <td><input type="radio" name="hzx" value="毛坯" <c:if test="${requestScope.house.hzx eq '毛坯'}">checked</c:if>>毛坯
                <input type="radio" name="hzx" value="简装" <c:if test="${requestScope.house.hzx eq '简装'}">checked</c:if>>简装
                <input type="radio" name="hzx" value="精装" <c:if test="${requestScope.house.hzx eq '精装'}">checked</c:if>>精装
                </td>
        </tr>
        <tr>
            <td>楼层：</td>
            <td><input name="hlc" value="${requestScope.house.hlc}"></td>
        </tr>
        <tr>
            <td>租金(￥)：</td>
            <td><input name="hzj" value="${requestScope.house.hzj}"></td>
        </tr>
        <tr>
            <td>房东：</td>
            <td><input name="hfd" value="${requestScope.house.hfd}"></td>
        </tr>
        <tr>
            <td>房东电话：</td>
            <td><input name="hfdtel" value="${requestScope.house.hfdtel}"></td>
        </tr>
        <tr>
            <td>出租情况：</td>
            <td><input type="radio" value="未出租" name="hqk" <c:if test="${requestScope.house.hqk eq '未出租'}">checked</c:if>>未出租
                <input type="radio" value="已出租" name="hqk" <c:if test="${requestScope.house.hqk eq '已出租'}">checked</c:if>>已出租</td>
        </tr>
        <tr>
            <td colspan="2"><button>确定</button></td>
        </tr>
    </table>
</form>
</body>
</html>

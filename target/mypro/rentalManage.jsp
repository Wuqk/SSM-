<%@ page import="com.yjsj.mypro.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.yjsj.mypro.entity.House" %>
<%@ page import="com.yjsj.mypro.dao.house_Dao" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    .tcent {
        text-align: center;
        border: black solid 1px;
        padding: 0px;
        margin: 0px;
    }

    .tcent td {
        border: black solid 1px;
        padding: 0px;
        margin: 0px;
    }
</style>
<table class="tcent">
    <tr>
        <td colspan="7" style="border: 0px;">房屋出租管理</td>
        <td colspan="6" style="border: 0px;"><a href="release.jsp">发布信息</a></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>所在区域</td>
        <td>小区名称</td>
        <td>房型</td>
        <td>房屋面积</td>
        <td>装修情况</td>
        <td>楼层</td>
        <td>租金</td>
        <td>房东</td>
        <td>房东电话</td>
        <td>出租情况</td>
        <td>发布人</td>
        <td>修改</td>
    </tr>
    <c:if test="${requestScope.houseList.size() != 0}">
        <c:forEach items="${requestScope.houseList}" var="h">
            <td>${h.hid}
            </td>
            <td>${h.harea}
            </td>
            <td>${h.hname}
            </td>
            <td>${h.hfx}
            </td>
            <td>${h.hmj}
            </td>
            <td>${h.hzx}
            </td>
            <td>${h.hlc}
            </td>
            <td>${h.hzj}
            </td>
            <td>${h.hfd}
            </td>
            <td>${h.hfdtel}
            </td>
            <td <c:if test="${h.hqk eq '未出租'}">style="color: red;font-weight: bolder;" </c:if>>${h.hqk}
            </td>
            <td>${sessionScope.user.urealname}
            </td>
            <td><a href="/mypro/ModifyServlet?hid=${h.hid}">修改</a></td>
            </tr>
        </c:forEach>
    </c:if>
    <c:if test="${requestScope.houseList.size() ==0}">
        <tr>
            <td colspan="13" class="tcent">您暂时还未发布过房屋出租信息！</td>
        </tr>
    </c:if>
</table>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>show</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="5" width="500px">
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>名称</td>
        <td>性别</td>
    </tr>
    <c:forEach items="${list }" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.username }</td>
            <td>${user.name }</td>
            <td><c:if test="${user.gender == 0}">男</c:if>
                <c:if test="${user.gender == 1}">女</c:if></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>


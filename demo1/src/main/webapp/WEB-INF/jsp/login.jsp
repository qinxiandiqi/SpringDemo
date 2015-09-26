<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jianan
  Date: 9/26/15
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Spring Demo 1 Login</title>
</head>
<body>
  <c:if test="${!empty error}">
    <font color="red"><c:out value="${error}"/></font>
  </c:if>
  <form action="<c:url value="/loginCheck.html"/> " method="post">
    username:<input type="text" name="userName"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="login">
    <input type="reset" value="reset">
  </form>
</body>
</html>

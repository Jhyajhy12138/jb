<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/3
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<strong>Welcome!</strong><br>
uId = ${sessionScope.user.uId}<br>
uTel = ${sessionScope.user}
</body>
</html>

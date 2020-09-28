<%--
  Created by IntelliJ IDEA.
  User: liuxiaoming
  Date: 20/9/27
  Time: 下午4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>success page</h4>

    date:${requestScope.date}
<br><br>
    names:${requestScope.names}

    <br><br>
    request user:${requestScope.user}
    <br>
    request abc:${requestScope.abc}
    <br>
    request shchool:${requestScope.school}
    <br><br>
    session user:${sessionScope.user}
    <br>
    session school:${sessionScope.school}
</body>
</html>

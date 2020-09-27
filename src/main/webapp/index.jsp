<%--
  Created by IntelliJ IDEA.
  User: liuxiaoming
  Date: 20/9/27
  Time: 下午3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="springmvc/testPathVariable/2">testPathVariable</a>
    <br><br>
    <a href="helloworld">hello world</a>
    <br><br>
    <a href="springmvc/testRequestMapping">TestRequestMapping</a>
    <br><br>
    <a href="springmvc/testMethod">TestMethod </a>

    <form action="springmvc/testMethod" method="post">
        <input type="submit" value="submit">
    </form>
    <br><br>
    <a href="springmvc/testParamsAndHeaders?username=xiaoming&age=11">testParamsAndHeaders </a>
</body>
</html>

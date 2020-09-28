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

    <a href="springmvc/testView">testView</a>
    <br><br>
    <form action="springmvc/testModelAttribute" method="post">
        <input type="hidden" name="id" value="1">
        username:<input type="text" name="username" value="Tom"/>
        <br>
        email:<input type="text" name="email" value="Tom@guigu.com"/>
        <br>
        age:<input type="text" name="age" value="13">
        <br>
        <input type="submit" value="submit"/>
    </form>
    <br><br>
    <a href="springmvc/testMap">testMap</a>
    <br><br>
    <a href="springmvc/testSessionAttributes">testSessionAttributes</a>
    <br><br>
    <a href="springmvc/testModeAndView">testModeAndView</a>
    <br><br>
    <a href="springmvc/testServletAPI">testServletAPI</a>
    <br><br>
    <form action="springmvc/testPojo" method="post" charset="UTF-8">
        username:<input type="text" name="username"/>
        <br>
        password:<input type="password" name="password"/>
        <br>
        email:<input type="text" name="email"/>
        <br>
        age:<input type="text" name="age">
        <br>
        city:<input type="text" name="address.city">
        <br>
        province:<input type="text" name="address.province">
        <br>
        <input type="submit" value="submit"/>
    </form>
    <br><br>
    <a href="springmvc/testCookileValue">testCookileValue</a>
    <br><br>
    <a href="springmvc/testRequestHeader">testRequestHeader</a>
    <br><br>
    <a href="springmvc/testRequestParams?username=xiaoming&age=11">testRequestParams</a>
    <br><br>
    <form action="springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="PUT"/>
        <input type="submit" value="test rest PUT"/>
    </form>
<br><br>
    <form action="springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="DELETE"/>
        <input type="submit" value="test rest delete"/>
    </form>
<br><br>
    <form action="springmvc/testRest" method="post">
        <input type="submit" value="test rest post">
    </form>
<br><br>
    <a href="springmvc/testRest/1">test rest get</a>
<br><br>

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

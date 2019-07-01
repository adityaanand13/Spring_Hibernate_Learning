<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: adityaanand
  Date: 2019-07-01
  Time: 00:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Show Form</title>
</head>
<body>
    <h1>Show form</h1>
    <hr><
    <form action="process-form" method="GET">
        <label>
            <input type="text" name="StudentName" placeholder="Hey, what's your name?">
        </label>
        <input type="submit">
    </form>
</body>
</html>

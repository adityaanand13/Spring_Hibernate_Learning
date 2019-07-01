<%--
  Created by IntelliJ IDEA.
  User: adityaanand
  Date: 2019-07-01
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
    <h1>Created New Student Confirmation</h1>
    <hr>

    First Name: ${student.firstName}
    <br>
    Last Name: ${student.lastName}
    <br>
    state: ${student.state}
    <br>
    Course: ${student.course}
    <br>
    Gender: ${student.gender}
    <br>
    Language: <ul>
        <c:forEach var="temp" items="${student.language}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: adityaanand
  Date: 2019-07-02
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Customer Registration form</title>
    <style>
        .error{ color: red;}
    </style>
</head>
<body>
    <form:form action="process-form" modelAttribute="customer">
        First Name: <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>
        <br><br>
        Last Name: <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>

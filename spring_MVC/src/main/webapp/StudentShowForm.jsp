<%--
  Created by IntelliJ IDEA.
  User: adityaanand
  Date: 2019-07-01
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="process-form" modelAttribute="student">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name : <form:input path="lastName"/>
        <br><br>
        State: <form:select path="state">
            <form:options items="${student.stateOptions}"/>
        </form:select>

<%--    using old school method--%>
<%--        <form:select path="state">--%>
<%--            <form:option value="Andra Pradesh" label="Andra Pradesh"/>--%>
<%--            <form:option value="Arunachal Pradesh" label="Arunachal Pradesh"/>--%>
<%--            <form:option value="Assam" label="Assam"/>--%>
<%--            <form:option value="Bihar" label="Bihar"/>--%>
<%--            <form:option value="Chhattisgarh" label="Chhattisgarh"/>--%>
<%--            <form:option value="Goa" label="Goa"/>--%>
<%--            <form:option value="Gujarat" label="Gujarat"/>--%>
<%--            <form:option value="Haryana" label="Haryana"/>--%>
<%--            <form:option value="Himachal Pradesh" label="Himachal Pradesh"/>--%>
<%--            <form:option value="Jammu and Kashmir" label="Jammu and Kashmir"/>--%>
<%--            <form:option value="Jharkhand" label="Jharkhand"/>--%>
<%--            <form:option value="Karnataka" label="Karnataka"/>--%>
<%--            <form:option value="Kerala" label="Kerala"/>--%>
<%--            <form:option value="Madya Pradesh" label="Madya Pradesh"/>--%>
<%--            <form:option value="Maharashtra" label="Maharashtra"/>--%>
<%--            <form:option value="Manipur" label="Manipur"/>--%>
<%--            <form:option value="Meghalaya" label="Meghalaya"/>--%>
<%--            <form:option value="Mizoram" label="Mizoram"/>--%>
<%--            <form:option value="Nagaland" label="Nagaland"/>--%>
<%--            <form:option value="Orissa" label="Orissa"/>--%>
<%--            <form:option value="Punjab" label="Punjab"/>--%>
<%--            <form:option value="Rajasthan" label="Rajasthan"/>--%>
<%--            <form:option value="Sikkim" label="Sikkim"/>--%>
<%--            <form:option value="Tamil Nadu" label="Tamil Nadu"/>--%>
<%--            <form:option value="Telagana" label="Telagana"/>--%>
<%--            <form:option value="Tripura" label="Tripura"/>--%>
<%--            <form:option value="Uttaranchal" label="Uttaranchal"/>--%>
<%--            <form:option value="Uttar Pradesh" label="Uttar Pradesh"/>--%>
<%--            <form:option value="West Bengal" label="West Bengal"/>--%>
<%--            <form:option value="Andaman and Nicobar Islands" label="Andaman and Nicobar Islands"/>--%>
<%--            <form:option value="Dadar and Nagar Haveli" label="Dadar and Nagar Haveli"/>--%>
<%--            <form:option value="Daman and Diu" label="Daman and Diu"/>--%>
<%--            <form:option value="Delhi" label="Delhi"/>--%>
<%--            <form:option value="Lakshadeep" label="Lakshadeep"/>--%>
<%--            <form:option value="Pondicherry" label="Pondicherry"/>--%>
<%--        </form:select>--%>
        <br><br>
        Course: UG <form:radiobutton path="course" value="under graduate"/>
        PG <form:radiobutton path="course" value="Post graduate"/>
        PHD <form:radiobutton path="course" value="PHD scholar"/>
        <br><br>
        Gender: male <form:radiobutton path="gender" value="male"/>
        female <form:radiobutton path="gender" value="male"/>
        <br><br>
        Language: Hindi<form:checkbox path="language" value="Hindi"/>
        English <form:checkbox path="language" value="English"/>
        Punjabi <form:checkbox path="language" value="Punjabi"/>
        Others <form:checkbox path="language" value="Others"/>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>

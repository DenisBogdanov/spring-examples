<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

<h1>Student Confirmation</h1>

<p>Student: ${student.firstName} ${student.lastName} from ${student.country}</p>
<p>Favorite programming language: ${student.favoriteLanguage}</p>
<p>
    Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</p>

</body>
</html>

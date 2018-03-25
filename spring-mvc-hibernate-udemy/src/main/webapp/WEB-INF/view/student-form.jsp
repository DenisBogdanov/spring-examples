<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<form:form action="process-form" method="get" modelAttribute="student">

    <label>
        First name:
        <form:input path="firstName"/>
    </label>
    <br>
    <label>
        Last name:
        <form:input path="lastName"/>
    </label>
    <br>
    <label>
        Country:
        <form:select path="country">
            <form:options items="${student.countries}"/>
        </form:select>
    </label>
    <br>
    <label>
        Favorite Programming Language:
        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
        JS <form:radiobutton path="favoriteLanguage" value="JS"/>
        Python <form:radiobutton path="favoriteLanguage" value="Python"/>
    </label>
    <br>
    <label>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
    </label>
    <br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>

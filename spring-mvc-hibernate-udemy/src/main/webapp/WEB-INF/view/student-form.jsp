<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>

<p><em>Fill out the form. Asterisk (*) means required.</em></p>

<form:form action="process-form" method="get" modelAttribute="student">

    <label>
        First name:
        <form:input path="firstName"/>
    </label>
    <br><br>

    <label>
        Last name (*):
        <form:input path="lastName"/>
    </label>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    <label>
        Country:
        <form:select path="country">
            <form:options items="${student.countries}"/>
        </form:select>
    </label>
    <br><br>

    <label>
        Postal Code (*):
        <form:input path="postalCode"/>
    </label>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>

    Favorite Programming Language:
    <label>Java <form:radiobutton path="favoriteLanguage" value="Java"/></label>
    <label>Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/></label>
    <label>JS <form:radiobutton path="favoriteLanguage" value="JS"/></label>
    <label>Python <form:radiobutton path="favoriteLanguage" value="Python"/></label>
    <br><br>

    Operating Systems:
    <label>Linux <form:checkbox path="operatingSystems" value="Linux"/></label>
    <label>Windows <form:checkbox path="operatingSystems" value="Windows"/></label>
    <label>MacOS <form:checkbox path="operatingSystems" value="MacOS"/></label>
    <br><br>

    <input type="submit" value="Submit">

</form:form>

</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="processForm" modelAttribute="studentQWE">
    First Name: <form:input path="firstName"/>
    <br><br>

    Last Name: <form:input path="lsatName"/>
    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${studentQWE.countryOptions}"/>
        <%--        <form:option value="France" label="France"/>--%>
        <%--        <form:option value="Germany" label="Germany"/>--%>
        <%--        <form:option value="India" label="India"/>--%>
    </form:select>
    <br><br>

    Favorite Language:

    Java    <form:radiobutton path="favoriteLanguage" value="Java"/>
    C++     <form:radiobutton path="favoriteLanguage" value="C++"/>
    Piton   <form:radiobutton path="favoriteLanguage" value="Piton"/>
    JS      <form:radiobutton path="favoriteLanguage" value="JS"/>
    <br><br>

    Operating Systems:

    Linux       <form:checkbox path="operatingSystems" value="Linux"/>
    macOS      <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows  <form:checkbox path="operatingSystems" value="MS Windows"/>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${studentQWE.firstName} ${studentQWE.lsatName}

<br><br>

Country: ${studentQWE.country}

<br><br>

Favorite Language: ${studentQWE.favoriteLanguage}

<br><br>

Operating Systems:
<ul>
    <c:forEach var="temp" items="${studentQWE.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>

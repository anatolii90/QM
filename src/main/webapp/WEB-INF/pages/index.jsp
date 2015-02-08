<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

    <h1>Users list:</h1>

    <ul>
        <c:forEach items="${users}" var="user">
            <li>${user.login} : ${user.password}</li>
        </c:forEach>
    </ul>

</body>
</html>

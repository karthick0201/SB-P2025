<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form:form method="post" modelAttribute="loginDto" action="validate-user">
        <table>
            <tr>
                <td>Username :</td>
                <td><form:input path="userName" /></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Login" /></td>
            </tr>
        </table>
    </form:form>
    
    
    <br>
    <br>
    <a style="align-content: center;" href = "register">Register HERE!!!</a>
</body>
</html>
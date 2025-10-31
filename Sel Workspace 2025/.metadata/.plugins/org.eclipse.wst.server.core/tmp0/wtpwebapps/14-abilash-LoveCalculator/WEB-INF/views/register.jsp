<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <form:form method="post" modelAttribute="registerDto" action="save-user">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
                 <td><form:errors path="email" /></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><form:input path="phoneNo" /></td>
                <td><form:errors path="phoneNo" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password" /></td>
                 <td><form:errors path="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register" /></td>
            </tr>
        </table>
        
		<a href = "login">Login Page</a>        
    </form:form>
</body>
</html>

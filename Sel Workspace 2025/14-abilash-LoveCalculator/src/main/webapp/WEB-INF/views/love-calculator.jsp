<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Love Calculator</title>
</head>
<body>
    <h2>Love Calculator</h2>
    
    <h4> Welcome ${user.name}</h4>
    
    <br><br>
    
    
    <form:form method="post" modelAttribute="loveDto" action="calculate">
        <table>
            <tr>
                <td>Your Name:</td>
                <td><form:input path="yourName" /></td>
            </tr>
            <tr>
                <td>Crush Name:</td>
                <td><form:input path="crushName" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Calculate Love %" /></td>
            </tr>
        </table>
    </form:form>
    <br>
    <a href="view-history">User History</a> <br>
    <a href="logout">Logout</a> 
    <br>
    
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: HarryZ
  Date: 3/6/17
  Time: 11:03 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<head>
    <title>Groovy Games</title>
    <h>Welcome to Groovy Games</h>
</head>

    <g:form action="details" controller="matchHistory">
        <g:textField name="playerId"/>
        <g:submitButton name="retrieve" value="retrieve" />

    </g:form>
</body>
</html>
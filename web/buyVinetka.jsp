<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 14.3.2019 г.
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buy Vinetka</title>
</head>
<body>

<h1>Buy Vinetka Here</h1>

<form action="/web_war_exploded/buyVinetka" method="post">
    Name:
    <input type="text" name="name">
    Number Vehicle:
    <input type="text" name="numberVehicle">
    Select Vehicle:
    <select name="typeVehicle">
        <option value="normal">Normal</option>
        <option value="truck">Truck</option>
        <option value="other">Other</option>
    </select>
    <input type="submit" value="Buy">
</form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/18
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="form-box">
    <form  method="post" >
        <input type="text" style="display:none">
        <input type="password" style="display:none">
        <input name="username" type="text" placeholder="username" autocomplete="off">
        <input name="password" type="password" placeholder="password">
        <input name="confirmPassword" type="password" placeholder="confirm" autocomplete="off">
        <button class="btn btn-info btn-block login" type="submit">Register</button>
        <br>
        <a href="">click to login</a>
    </form>
</div>
</body>
</html>

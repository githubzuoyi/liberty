<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/18
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="form-box">
        <form  method="post">
            <%--以下两条语句是为了防止浏览器自动填充用户名和密码--%>
            <input type="text" style="display:none">
            <input type="password" style="display:none">
            <input name="username" type="text" placeholder="username" autocomplete="off">
            <input name="password" type="password" placeholder="password" autocomplete="off">
            <button class="btn btn-info btn-block login" type="submit">Login</button>
            <br>
            <a href="login.html?page=1">click to register</a>
        </form>
    </div>
</body>
</html>

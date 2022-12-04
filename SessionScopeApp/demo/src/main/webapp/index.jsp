<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="session">Hello Servlet</a>
<form action="session" method="post">
    <label for="username">UserName:</label>
    <input id="username" name="input_name" type="text"/>
    <button type="submit" name="submit"  value="submit">send</button>
</form>
</body>
</html>



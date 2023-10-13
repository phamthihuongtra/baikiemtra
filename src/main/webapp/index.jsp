<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<a href="hello-servlet">Hello Servlet</a>
<form action="newStudent" method="post">

    <input type="number" name="id" placeholder="id">
    <input type="text" name="name" placeholder="ho va ten">
    <input type="number" name="age" placeholder="tuoi">
    <input type="text" name="address" placeholder="diachi">
    <input type="submit" name="submit">






</form>
</body>
</html>
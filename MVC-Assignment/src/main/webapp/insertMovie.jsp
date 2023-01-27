<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./CSS/css.css">
</head>
<body>
<form method="post" action="insert" class="update">
	<input type="text" name="title" placeholder="title">
	<input type="text" name="year" placeholder="year">
	<input type="text" name="director" placeholder="director">
	<input type="text" name="stars" placeholder="stars">
	<input type="text" name="review" placeholder="reviewl">
	<input type="submit" name="insertMovie" value="add movie">
</form>
</body>
</html>
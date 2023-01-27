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


<form method="post" action="update" class="update">
	<input type="hidden" name="updateId" value = '${film.id}'>
	<input type="text" name="updateTitle" value= '${film.title}'>
	<input type="text" name="updateYear" value='${film.year}'>
	<input type="text" name="updateDirector" value='${film.director}'>
	<input type="text" name="updateStars" value='${film.stars}'>
	<input type="text" name="updateReview" value='${film.review}'>
	<input type="submit" name="updateMovie" value="Update Movie">
</form>


</body>
</html>
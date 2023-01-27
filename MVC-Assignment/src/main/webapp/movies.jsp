<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All movies</title>
<link rel="stylesheet" href="./CSS/css.css">
</head>
<body>
<table>
<tr>
	<th>Title</th>
	<th>Year</th>
	<th>Director</th>
	<th>Stars</th>
	<th>Review</th>
	<th>update</th>
	<th>delete</th>
</tr>
	<c:forEach items="${showFilms}" var="f">
		<tr>
			<td>${f.title}</td>
			<td>${f.year}</td>
			<td>${f.director}</td>
			<td>${f.stars}</td>
			<td>${f.review}</td>
			<td>
				<form action="update" method="get">
					<button name="update" value="${f.id}">update</button>
				</form>
			</td>
			<td>
				<form action="delete" method="post">
					<button name="delete" value="${f.id}">Delete</button>
				</form>
			</td>
		</tr>
	</c:forEach>	
</table>
</body>
</html>

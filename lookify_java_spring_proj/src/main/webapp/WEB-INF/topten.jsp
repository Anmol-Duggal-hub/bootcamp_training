<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<p>Top Ten Songs:</p>
	<a href="/dashboard">Dashboard</a>
	<ul>
		<c:forEach items="${topten}" var="song" end="9">
			<li><c:out value="${song.rating} - ${song.title} - ${song.artist}"/></li>
		</c:forEach>
	</ul>
</body>
</html>
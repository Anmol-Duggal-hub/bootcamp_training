<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="${language.name}"/></h1>
	<p>Description: <c:out value="${language.creator}"/></p>
	<p>Language: <c:out value="${language.currentVersion}"/></p>
	<a href="/languages/${language.id}/edit">Edit</a>
	<a href="/languages/${language.id}/delete">Delete</a>
	<a href="/languages">Dashboard</a>
</body>
</html>
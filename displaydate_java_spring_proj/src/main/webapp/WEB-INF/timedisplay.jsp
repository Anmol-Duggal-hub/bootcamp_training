<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="../css/main.css" type="text/css"/>
	<script type="text/javascript" src="../js/datedisplayalert.js"></script>
	<meta charset="UTF-8">
	<title>Time Display</title>
</head>
	<body>
		<script>
			myTimeFunc();
		</script>
		<h1 class="time"><fmt:formatDate pattern="HH:mm aa"  value="${date}"/></h1>
	</body>
</html>
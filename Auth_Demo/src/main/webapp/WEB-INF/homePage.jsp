<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${user.name}" /></h1>
	<a href="/logout">Logout</a>
	<h2>Courses</h2>
	<a>Low Sign Up</a>
	<a>High Sign Up</a>
		<table>
	    <thead>
	        <tr>
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Current Version</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${courses}" var="courses">
	        <tr>
	          	<td><a href="/courses/${course.id}"><c:out value="${course.name}"/></a></td>
	            <td><c:out value="${course.instructor}"/></td>
	            <td><c:out value="${course.capacity}"/></td>
	            <td><c:out value="Full"/></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<button>Add a Course</button>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New License</h1>
	<form:form action="/newlicense" method="post" modelAttribute="license">
		<p>
			<form:label path="person">Person</form:label>
			<form:select path="person">
				<c:forEach items="${allPersons}" var="p">
					<form:option value = "${p.id}">
						<c:out value = "${p.firstName} ${p.lastName}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			
		</p>
		<p>
	        <form:label path="expirationDate">Expiration Date</form:label>
	        <form:errors path="expirationDate"/>
	        <form:input path="expirationDate"/>
	    </p>   
	    <p>
	        <form:label path="state">State</form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
	    </p>
	    <input type="submit" value="Create"/>
	</form:form> 
</body>
</html>
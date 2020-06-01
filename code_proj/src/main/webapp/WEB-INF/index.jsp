<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
</head>
<body>
	<div>
		<p>${error}</p>
		<p>What is the code</p>
		<form action="/" method="post">
			<input type="text" name="code">
			<button type="submit">Try Code</button>
		</form>
	</div>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="/" method="post">
			<p>Your Name:</p>
			<input type="text" name="name">
			<p>Dojo Location:</p>
			<select name="location">
				<option value="sanjose">San Jose</option>
				<option value="oakland">Oakland</option>
				<option value="burbank">Burbank</option>
				<option value="newyork">New York</option>
			</select>
			<p>Favorite Language:</p>
			<select name="language">
				<option value="python">Python</option>
				<option value="java">Java</option>
				<option value="swift">Swift</option>
				<option value="csharp">C-Sharp</option>
			</select>
			<p>Comment (optional):</p>
			<input type="text" name="comment">
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>
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
	<p>Songs by artist: <c:out value="${artistSongList[0].artist}"/></p>
	<form action="/search" method="post">
		<input type="text" name="search">
		<button type="submit">Search Artist</button>
	</form>
	<a href="/dashboard">Dashboard</a>
	<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Artist</th>
            <th>Rating</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${artistSongList}" var="song">
        <tr>
            <td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.artist}"/></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/song/${song.id}/delete">Delete</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
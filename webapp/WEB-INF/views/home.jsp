<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to cinema app</title>
</head>
<body>
	<h1>Home, Welcome to main page</h1>
	<ol>
		<c:forEach items="${movies}" var="movie">
			<li>${ movie }</li>
		</c:forEach>
	</ol>
</body>
</html>
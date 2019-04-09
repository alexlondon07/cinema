<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to cinema app</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	
 <spring:url value="/resources" var="urlPublic" />

</head>
<body>
	<h1>Home, Welcome to main page</h1>
	<div class="container-fluid">
		<div class="panel panel-primary">
			<div class="panel-heading">Table to movies</div>
			<div class="panel-body">
				<table class="table table-hover">
					<tr>
						<th>id</th>
						<th>Title</th>
						<th>Duration</th>
						<th>Classification</th>
						<th>Gender</th>
						<th>Image</th>
						<th>Release Date</th>
						<th>Status</th>
					</tr>
					<tbody>
						<c:forEach items="${movies}" var="movie">
							<tr>
								<td>${ movie.id }</td>
								<td>${ movie.title }</td>
								<td>${ movie.duration }min.</td>
								<td>${ movie.classification }</td>
								<td>${ movie.gender }</td>
								<td><img width="80" height="60" class="img-responsive" alt="Responsive image" src="${urlPublic}/images/${movie.image}"></td>
								<td><fmt:formatDate value="${ movie.releaseDate }" pattern="dd-MM-yyyy"/></td>
								<td>
									<c:choose>
										<c:when test="${ movie.status=='Active' }">
											<span class="label label-success">Activa</span>
										</c:when>
										<c:otherwise>
											<span class="label label-danger">Inactiva</span>
										</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
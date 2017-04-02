<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Car Name</th>
				<th>Car Description</th>

			</tr>
		</thead>
		<c:forEach items="${carlist }" var="car">
		<tr>
			<td>${car.id }</td>
			<td>${car.name }</td>
			<td>${car.description }</td>
			<c:url value="/admin/product/viewproduct/${car.id}" var="view"></c:url>
			<td><a href="${view}"><span class="glyphicon glyphicon-info-sign"></span></a>
			<c:url value="/admin/product/removeproduct/${car.id}" var="remove"></c:url>
			<a href="${remove }"><span class="glyphicon glyphicon-remove"></span></a>
			<c:url value="/admin/product/editproduct/${car.id}" var="edit"></c:url>
			<a href="${edit }"><span class="glyphicon glyphicon-pencil"></span></a></td>
			</tr>

		</c:forEach>



	</table>
</body>
</html>
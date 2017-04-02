<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
#navigation {
	background-color: #f4e842;
}
</style>

</head>
<body>
	<nav class="navbar navbar-default navbar-static-top" id="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">CarPortal</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="/CarPortal">Home</a></li>
			<li><a href="/CarPortal/aboutus">About Us</a></li>
			<li><a href="/CarPortal/contactus">Contact Us</a></li>
			<c:url value="/admin/product/showproductform" var="add"/>
			<li><a href="${add }">Add New Car</a></li>
		</ul>
		<form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Name a Car">
				<button type="submit" class="btn btn-danger">
					<span class="glyphicon glyphicon-search"></span>
				</button>
			</div>

		</form>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
		</ul>
	</div>
	</nav>
</body>
</html>
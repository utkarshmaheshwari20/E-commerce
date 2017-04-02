<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN || ADD CAR FORM</title>
</head>
<body>
	<div class="container-wrapper">
		<div class="container">
			<c:url value="/admin/product/addproduct" var="add"></c:url>
			<form:form action="${add}" modelAttribute="carObj" enctype="multipart/form-data">
				<div class="form-group">

					<form:hidden path="id" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="name">Name</form:label>
					<form:input path="name" class="form-control" />
					<form:errors path="name" cssClass="error"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="brand">Brand</form:label>
					<form:input path="brand" class="form-control" />
					<form:errors path="brand" cssStyle="color:#ff0000"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="description">Description</form:label>
					<form:input path="description" class="form-control" />
					<form:errors path="description" cssStyle="color:#ff0000"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="price">Price</form:label>
					<form:input path="price" class="form-control" />
					<form:errors path="price" cssStyle="color:#ff0000"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="img">Insert Image</form:label>
					<form:input path="img" type="file" />
				</div>
				<input type="submit" value="Add Car" />
			</form:form>
		</div>
	</div>

</body>
</html>
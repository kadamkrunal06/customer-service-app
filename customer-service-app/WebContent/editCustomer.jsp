<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Edit Customer</title>
</head>
<body align="center">
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Customer Information</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="customerController">View</a></li>
			<li><a href="addNewCustomer">Add</a></li>
		</ul>
	</div>
	</nav>
	<div class="jumbotron">
		<h1>Add Customers</h1>
	</div>

	<form action="editCustomer" method="post" class="form-inline">
		Customer Id: <input type="hidden" name="custId" class="form-control"
			value='<%=request.getAttribute("customerId")%>'>&nbsp&nbsp<%=request.getAttribute("customerId")%><br>
		<br> Customer Name:<input type="text" name="custName"
			class="form-control"
			value='<%=request.getAttribute("customerName")%>'><br> <br>
		Customer Address:<input type="text" name="custAddress"
			class="form-control"
			value='<%=request.getAttribute("customerAddress")%>'><br>
		<br> <input type="submit" value="Edit Customer Data"
			class="btn btn-default">


	</form>

</body>
</html>
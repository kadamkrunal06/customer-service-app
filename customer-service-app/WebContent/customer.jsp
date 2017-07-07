<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.techlabs.service.customer.*, java.util.*"%> 
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
<title>Customer List</title>
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
			<li><a href="logoutController">Logout</a></li>
		</ul>
	</div>
	</nav>
	<div class="jumbotron">
		<h1>Customer List</h1>
	</div>
	<div class="container">

		<br> <br>
		<%
			ArrayList<Customer> cust = (ArrayList<Customer>) request
					.getAttribute("customers");
		%>
		<table class=' table table-bordered'>
			<tr>
				<th>Customer ID</th>
				<th>Customer Name</th>
				<th>Customer Address</th>
				<th>Operations</th>
			</tr>
			<%
				for (Customer customer : cust) {
			%>
			<tr>
				<td><%=customer.getCustomerId()%></td>
				<td><%=customer.getCustomerName()%></td>
				<td><%=customer.getCustomerAddress()%></td>
				<td><a
					href='<%=request.getContextPath()%>/editCustomer?id=<%=customer.getCustomerId()%>'>Edit</a>
					<a
					href='<%=request.getContextPath()%>/deleteCustomer?id=<%=customer.getCustomerId()%>'>Delete</a>
				</td>
			</tr>
			<%
				}
			%>
		</table>
		
	</div>
</body>
</html>
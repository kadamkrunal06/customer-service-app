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
<title>Login Page</title>
</head>
<body align="center">
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Customer Information</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="loginController">Login</a></li>
		</ul>
	</div>
	</nav>
	<div class="jumbotron">
		<h3>Login Page</h3>
	</div>
	<form class="form-inline" action="loginController" method="post">
		<div class="form-group">
			<label for="email">Username:</label> <input type="text"
				class="form-control" name="username">
		</div>
		<br> <br>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" name="pwd">
		</div>
		<br> <br>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>


	<div align="center">
		Customer List
		<table border="1">
			<tr>
				<th>Customer ID</th>
				<th>Customer Name</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td><c:out value="${customer.idCustomer}"></c:out></td>
					<td><c:out value="${customer.nameCustomer}"></c:out></td>
					<td><a href="editcustomer?customerId=${customer.idCustomer}">Update</a></td>
					<td><a
						href="deletecustomer?customerId=${customer.idCustomer}">Delete</a></td>
				</tr>
			</c:forEach>

		</table>

		<div align="center">
			<a href="addcustomer">Add a new Customer</a>
		</div>
	</div>
	
	

</body>
</html>
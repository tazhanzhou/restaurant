<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer's Orders</title>
</head>
<body>
	<div align="center">
		<p>Customer ID:</p>
		<p>Customer Name:</p>
		<table border="1">
			<tr>
				<th>Order ID</th>
			</tr>

			<c:forEach var="order" items="${customerHasOrdersList}">
				<tr>
					<td><c:out value="${order.idOrder}"></c:out></td>
				</tr>
			</c:forEach>

		</table>

	</div>
</body>
</html>
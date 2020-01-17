<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<div align="center">
		<form:form action="saveCustomer" method="post"
			modelAttribute="customer">
			<table>
				<form:hidden path="idCustomer" />

				<tr>
					<td>Customer Name</td>
					<td><form:input path="nameCustomer" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Add customer"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>
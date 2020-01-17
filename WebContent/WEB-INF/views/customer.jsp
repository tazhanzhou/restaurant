<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer info</title>
</head>
<body>
	<c:out value="${idCustomer}"></c:out>
	<c:out value="${nameCustomer}"></c:out>
</body>
</html>
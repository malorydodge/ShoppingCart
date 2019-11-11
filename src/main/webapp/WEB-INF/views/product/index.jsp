<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
<link href="/resources/static/css/products.css" rel="stylesheet" />
</head>
<body>

	<h3>Welcome to my shop!</h3>
	<table cellpadding="0" cellspacing="0" border="1">
		<tr class ="tbl-header">
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td><img src="${pageContext.request.contextPath }/resources/static/images/${product.photo }" width="50"></td>
				<td>${product.price }</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Add to Cart</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
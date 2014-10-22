<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ include file="/WEB-INF/jsp/template/headers.jsp" %> 
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <title>Test page</title> -->
</head>

<body>
	<h1> Test request </h1>
	<h2> Customer list </h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td><c:out value="${customer.id}" /></td>
				<td><c:out value="${customer.name}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
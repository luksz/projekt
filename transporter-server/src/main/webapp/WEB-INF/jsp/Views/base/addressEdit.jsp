<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/headers.jsp" %>
<div>
	<table>
		<tr>
			<td>Ulica</td>
			<td>
				<select name="addrStreetPrefix" required="required">
				    <c:forEach items="${addrStreetPrefixs}" var="prefix">
				        <option value="${prefix.id}" }>${prefix.name}</option>
				    </c:forEach>
				</select>
			</td>
			<td><input type="text" required="required" name="street" /></td>
		</tr>
		<tr>
			<td>Numer mieszkania</td>
			<td>
				<input type="text" required="required" name="local" />
			</td>
		</tr>
		<tr>
			<td>Miasto</td>
			<td><input type="text" required="required" name="city" /> </td>
			<td><input type="text" required="required" name="zipCode" /> </td>
		</tr>
		<tr>
			<td>Kraj</td>
			<td>
				<select name="addrStreetPrefix" required="required">
				    <c:forEach items="${addrStreetPrefixs}" var="prefix">
				        <option value="${prefix.id}" }>${prefix.name}</option>
				    </c:forEach>
				</select>
			</td>
		</tr>
	</table>
</div>

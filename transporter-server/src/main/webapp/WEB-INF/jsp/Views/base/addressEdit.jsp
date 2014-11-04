<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/headers.jsp" %>
<tr>
	<td><form:label path="enumAddrStreetPrefix">Ulica</form:label></td>
	<td>
		<form:select path="enumAddrStreetPrefix">
		    <form:options items="${addrStreetPrefixs}" itemValue="id" itemLabel="name"/>
		</form:select>
	</td>
	<td><form:input path="street"></form:input></td>
</tr>
<tr>
	<td><form:label path="local">Numer mieszkania</form:label></td>
	<td>
		<form:input path="local" />
	</td>
</tr>
<tr>
	<td><form:label path="city">Miasto</form:label></td>
	<td><form:input path="city" /> </td>
	<td><form:input path="zipCode" /> </td>
</tr>
<tr>
	<td><form:label path="country">Kraj</form:label></td>
	<td>
		<form:select path="country">
		    <form:options items="${countries}" itemValue="id" itemLabel="name"/>
		</form:select>
	</td>
</tr>

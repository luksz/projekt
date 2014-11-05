<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/headers.jsp" %>
<tr>
	<td><form:label path="${addressPrefix}enumAddrStreetPrefix">Ulica</form:label></td>
	<td>
		<form:select path="${addressPrefix}enumAddrStreetPrefix">
		    <form:options items="${addrStreetPrefixs}" itemValue="id" itemLabel="name"/>
		</form:select>
	</td>
	<td><form:input path="${addressPrefix}street"></form:input></td>
</tr>
<tr>
	<td><form:label path="${addressPrefix}local">Numer mieszkania</form:label></td>
	<td>
		<form:input path="${addressPrefix}local" />
	</td>
</tr>
<tr>
	<td><form:label path="${addressPrefix}city">Miasto</form:label></td>
	<td><form:input path="${addressPrefix}city" /> </td>
	<td><form:input path="${addressPrefix}zipCode" /> </td>
</tr>
<tr>
	<td><form:label path="${addressPrefix}country">Kraj</form:label></td>
	<td>
		<form:select path="${addressPrefix}country">
		    <form:options items="${countries}" itemValue="id" itemLabel="name"/>
		</form:select>
	</td>
</tr>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/headers.jsp" %>
<div>
	<table>
		<form:form action="/transporter-server/log/register" method="post" modelAttribute="user">
		<tr>
			<td><form:label path="username">Użytkownik</form:label></td>
			<td><form:input path="username"/></td>
		</tr>
		<tr>
			<td><form:label path="password">Hasło</form:label></td>
			<td><form:password path="password" /></td>
		</tr>
<%-- 		<tr>
			<td><form:label path="password">Powtórz hasło</form:label></td>
			<td><form:password path="password" /></td>
		</tr> --%>
		<tr>
			<td><form:label path="email">E-mail</form:label></td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Utwórz"/>
			</td>
		</tr>
		</form:form>
		<form:form action="/transporter-server/log/register" method="post" modelAttribute="customer">
		<tr>
			<td><form:label path="name">Imię</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="surname">Nazwisko</form:label></td>
			<td><form:input path="surname" /></td>
		</tr>
		<tr>
			<td><form:label path="company">Firma</form:label></td>
			<td><form:input path="company" /></td>
		</tr>
		<tr>
			<td><form:label path="nip">NIP</form:label></td>
			<td><form:input path="nip" /></td>
		</tr>
		<tr>
			<td><form:label path="regon">REGON</form:label></td>
			<td><form:input path="regon" /></td>
		</tr>
		</form:form>
		<form:form action="/transporter-server/log/register" method="post" modelAttribute="baseAddress">
		<tr>
			<th>Adres</th>
		</tr>
		<tr>
			<td>
				<%@ include file="addressEdit.jsp" %>
			</td>
		</tr>
		</form:form>
		<form:form action="/transporter-server/log/register" method="post" modelAttribute="correspondeAddress">
		<tr>
			<th width="100%">Adres do korespondencji</th>
		</tr>
		<tr>
			<td>
				<%@ include file="addressEdit.jsp" %>
			</td>
		</tr>
		</form:form>
		<form:form action="/transporter-server/log/register" method="post">
		<tr>
			<td>
				<input type="submit" value="Utwórz"/>
			</td>
		</tr>
		</form:form>
	</table>
</div>
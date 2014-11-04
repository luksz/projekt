<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../template/headers.jsp" %>
<div>
	<table>
		<tr>
			<td>Użytkownik</td>
			<td><input type="text" required="required" name="username" /></td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td><input type="text" required="required" name="email" /></td>
		</tr>
		<tr>
			<td>Hasło</td>
			<td><input type="text" required="required" name="password" /></td>
		</tr>
		<tr>
			<td>Powtórz hasło</td>
			<td><input type="text" required="required" name="password" /></td>
		</tr>
		<tr>
			<td>Imię</td>
			<td><input type="text" required="required" name="name" /></td>
		</tr>
		<tr>
			<td>Nazwisko</td>
			<td><input type="text" required="required" name="surname" /></td>
		</tr>
		<tr>
			<td>Firma</td>
			<td><input type="text" name="company" /></td>
		</tr>
		<tr>
			<td>NIP</td>
			<td><input type="text" name="nip" /></td>
		</tr>
		<tr>
			<td>REGON</td>
			<td><input type="text" name="regon" /></td>
		</tr>
		<tr>
			<td>Adres</td>
		</tr>
		<tr>
			<td>
				<%@ include file="addressEdit.jsp" %>
			</td>
		</tr>
		<tr>
			<td>Adres do korespondencji</td>
		</tr>
		<tr>
			<td>
				<%@ include file="addressEdit.jsp" %>
			</td>
		</tr>
	</table>
</div>
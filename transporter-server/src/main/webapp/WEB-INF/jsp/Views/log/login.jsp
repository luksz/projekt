<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/template/headers.jsp" %>
<trans:template>
<form action="/log/login.jsp" method=post>	
	<div class="login">
		<table>
			<tr>
				<td><h1> Login </h1></td>
			</tr>
			<tr>
				<td>Użytkownik</td>
				<td><input type="text" name="user" value=""></td>
			</tr>
			<tr>
				<td>Hasło</td>
				<td><input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td>
					<input name="submit" type="submit" value="Zaloguj" />
					<!-- <input name="register" type="button" value="Zarejestruj" onclick="redirect:/register"/> -->
					<a href="/Views/log/register.jsp"><button>Zarejestruj</button></a>
				</td>
			</tr>
		</table>
	</div>
</form>
</trans:template>
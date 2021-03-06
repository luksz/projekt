<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/template/headers.jsp" %>
<trans:template>
	<body>
		<div class="error">
			<h1>HTTP Status 403 - Access is denied</h1>
		 
			<c:choose>
				<c:when test="${empty username}">
				  <h2>You do not have permission to access this page!</h2>
				</c:when>
				<c:otherwise>
				  <h2>Username : ${username} <br/>
		                    You do not have permission to access this page!</h2>
				</c:otherwise>
			</c:choose>
 		</div>
</body>
</trans:template>
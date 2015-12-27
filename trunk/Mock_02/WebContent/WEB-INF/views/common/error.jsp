<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error</title>
</head>
<body style="text-align: center; padding-top: 10%; font-size: 24px;">
	<div style="color: red; font-family: cursive;">
		<c:choose>
			<c:when test = "${pageContext.request.userPrincipal.name !=  null}">
	       		Hello <label style="color: #4C9E31;">${pageContext.request.userPrincipal.name}</label>,
				Servers are having problems, please come back later. 
				<br>
				If you still can not access, please clear your cache and cookies of this page and try to access again.
				<br>
				<label style="color: #4C9E31;">Contact us: 0000-xx-00x</label>
	   		</c:when>
	   		<c:otherwise>
	   			Servers are having problems, please come back later.
	   			<br>
				If you still can not access, please clear your cache and cookies of this page and try to access again.
				<br>
				<label style="color: #4C9E31;">Contact us: 0000-xx-00x</label>
	   		</c:otherwise>
		</c:choose>
	</div>
</body>
</html>
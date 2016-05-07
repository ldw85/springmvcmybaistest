<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@include file="/WEB-INF/head/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function goback(){
		document.userlist.submit();
	}
</script>
</head>
<form name="userlist" action="<%=basePath%>/sysuser/list">
</form>
<body>
<table border="0">
		<tr >
			<td>id:</td>
			<td>${user.uId}</td>
		</tr>
		<tr >
			<td>name:</td>
			<td>${user.uName}</td>
		</tr>
		<tr >
			<td>age</td>
			<td>${user.uAge}</td>
		</tr>
		<tr >
			<td colspan="2">
				<a href="#" onclick="goback();">user list</a>
			</td>
		</tr>
		
</table>
</body>
</html>
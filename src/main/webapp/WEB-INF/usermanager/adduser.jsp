<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/head/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function onSubmit(){
		document.useradd.submit();
	}
</script>
<body>
<table border="0">
	<form name="useradd" action="<%=basePath %>/sysuser/adduser" method="post">
		<input type="hidden" name="_method" value="PUT">
		<tr >
			<td>id:</td>
			<td><input type="text" name="uId"></td>
		</tr>
		<tr >
			<td>name:</td>
			<td><input type="text" name="uName"></td>
		</tr>
		<tr >
			<td>age</td>
			<td><input type="text" name="uAge"></td>
		</tr>
		<tr >
			<td><input type="submit" value="submit" onclick="onSubmit();"></td>
		</tr>
	</form> 
</table>
</body>
</html>
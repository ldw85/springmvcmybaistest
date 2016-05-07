<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@include file="/WEB-INF/head/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
	function goback(){
		document.userlist.submit();
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<form name="userlist" action="<%=basePath%>/sysuser/list">
</form>
<body>
增加user成功。
<a href="#" onclick="goback();">user list</a>
</body>
</html>
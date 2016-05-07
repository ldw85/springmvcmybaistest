<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@include file="/WEB-INF/head/head.jsp" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onDetail(uId){
		document.detail.action="<%=basePath%>/sysuser/query/"+uId;
		document.detail.submit();
	}
	function onDel(uId){
		document.deleteForm.action="<%=basePath%>/sysuser/del/"+uId;
		document.deleteForm.submit();
	}
	function addUser(){
		document.adduser.submit();
	}
</script>
</head>
<form name="detail" action=""></form>
<form name="deleteForm" action=""></form>
<form name="adduser" action="<%=basePath%>/sysuser/useradd"></form>
<body>
<table border="0">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>age</td>
			<td>operation</td>
		</tr>
<c:forEach var="user" items="${list}" >
		<tr >		
			<td>${user.uId}</td>
			<td>${user.uName}</td>
			<td>${user.uAge}</td>
			<td>
			<a href="###" onclick="onDetail(${user.uId});">Detail</a>
			<a href="###" onclick="onDel(${user.uId});">Delete</a>
			</td>
		</tr>
</c:forEach>
	<tr>
			<td colspan="4"><a href="#" onclick="javascript:addUser();">adduser</a></td>			
		</tr>
</table>
</body>
</html>
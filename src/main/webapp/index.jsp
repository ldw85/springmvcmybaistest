<%@ include file="/WEB-INF/head/head.jsp"%>
<html>
<script type="text/javascript">
	function onAddUser(){
		document.adduser.submit();
	}
</script>
<form name="adduser" action="<%=basePath %>/sysuser/useradd">
<body>
<h2>Hello World!</h2>
<a href="#" onclick="onAddUser();">adduser</a>
</body>
</html>

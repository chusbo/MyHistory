<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<style>
<% 
	request.setCharacterEncoding("utf-8");
	String color=request.getParameter("color");
%>

	div
		{background-color:${color};}
	</style>
</head>
<body>
	<div>
		<fieldset>
			<legend>���� ����</legend>
			<h3> ������ ���� : <%= color %></h3>
		</fieldset>
	</div>
</body>
</html>
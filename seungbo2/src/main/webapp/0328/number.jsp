<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String number1=request.getParameter("number1");
		String number2=request.getParameter("number2");
		String range=request.getParameter("range");
		String command=request.getParameter("command");	
	%>
	<body>
		<fieldset>
			<legend>�α��� ����</legend>
			<h3> �����ο� : <%= number1 %></h3>
			<h3> ������ǰ : <%= number2 %></h3>
			<h3> ��� �ܰ� : <%= range %></h3>
			<h3> �߽� : <%= command %></h3>
		</fieldset>
	
	</body>


</body>
</html>
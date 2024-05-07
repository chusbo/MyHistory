<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String user_id=request.getParameter("user_id");
	String user_pw=request.getParameter("user_pw");
	%>
		<fieldset>
			<legend>로그인 정보</legend>
			<h3> 아이디 : <%= user_id %></h3>
			<h3> 비밀번호 : <%= user_pw %></h3>
				
		</fieldset>
</body>
</html>
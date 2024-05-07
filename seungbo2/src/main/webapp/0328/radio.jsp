<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String subject=request.getParameter("subject");
	String mailings[]=request.getParameterValues("mailing");
	String mail="";
	for(int i=0; i< mailings.length;i++)
	{if (mailings[i]==null) continue;
	else {mail = mail + mailings[i];}}
	%>
	
	<fieldset>
		<legend>신청과목</legend>
			<h3>신청 과목 :<%= subject %></h3>
	</fieldset>
	<fieldset>
		<legend>메일링</legend>
			<h3>메일링 :<%=mail %></h3>
	</fieldset>
</body>
</html>
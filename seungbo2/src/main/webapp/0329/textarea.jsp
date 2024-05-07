<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"
    isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>가입하기</legend>
			<h3>아이디 : ${new_id }</h3>
			<h3>비밀번호 : ${new_pw1 }</h3>
			<h3>비밀번호 확인 : ${new_pw2 }</h3>
			<h3>이름 : ${user_name }</h3>
			<h3>메일 주소 : ${user_mail }</h3>
			<h3>전화번호 : ${user_tel }</h3>
	</fieldset>

</body>
</html>
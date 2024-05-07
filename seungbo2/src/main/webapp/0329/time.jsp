<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<style>
		b{font-size:15px; color:red;}
	</style>
</head>
<body>
	<fieldset>
		<legend><b>1차 예약 결과</b></legend>
			<p>고객님이 <b>1차</b>로 예약하신 날짜는<b>${start1 } ~ ${end1 }</b>입니다.</p>
			<p>예약을 해주셔서 감사합니다.</p>
	</fieldset>
	<fieldset>
		<legend><b>2차 예약 결과</b></legend>
			<p>고객님이 <b>2차</b>로 예약하신 날짜는<b>${start2 } ~ ${end2 }</b>입니다.</p>
			<p>예약을 해주셔서 감사합니다.</p>
	
	</fieldset>
</body>
</html>
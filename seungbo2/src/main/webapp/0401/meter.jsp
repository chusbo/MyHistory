<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<style>
		body
			{background-color:#fff;}
		ul li
			{list-style:none;
			margin:15px 0;
			font-size:14px;}				
	</style>
</head>
<%
	request.setCharacterEncoding("utf-8");
	String user_top=request.getParameter("top");
	String user_pants=request.getParameter("pants");
	String user_shoes=request.getParameter("shoes");
	%>
<body>
	<form>
		<fieldset id="subject">
			<legend>쇼핑물 판매량</legend>			
				<ul>
					<li>
						<label>상의:${top }</label>
							<meter value=<%=user_top %> ></meter>
					</li>
					<li>
						<label>하의:${pants }</label>
							<meter min="0" max="100" value=<%=user_pants %>></meter>
					</li>
					<li>
						<label>신발:${shoes }</label>
							<meter min="0" max="600" low="0" high="500" value=<%=user_shoes %>></meter>
					</li>
				</ul>
		</fieldset>
	</form>
</body>
</html>
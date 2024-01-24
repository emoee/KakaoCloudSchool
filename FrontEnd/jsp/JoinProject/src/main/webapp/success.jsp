<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>로그인 성공했습니다.</h1>
	<h2><%=request.getAttribute("req_userid") %> 님! 로그인 되었습니다.</h2>
	<hr>
	<h2><%=session.getAttribute("s_userid") %> 님! 로그인 되었습니다.</h2>
	<hr>
	<a href="logeout.jsp">로그아웃</a>
</body>
</html>
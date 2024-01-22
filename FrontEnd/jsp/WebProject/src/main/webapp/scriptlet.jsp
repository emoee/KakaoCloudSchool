<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i= 0; i<5; i++){
	%>
	<h1 style="color:pink;"><%= i%></h1> 
	<!-- =가 out.write()를 의미한다. 명령어가 한줄만 가능하다. 출력명령이므로 보통 변수명만 작성한다. -->
	<%
	}
	%>

</body>
</html>
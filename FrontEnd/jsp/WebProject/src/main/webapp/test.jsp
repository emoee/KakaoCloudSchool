<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!-- 자바 코드가 어디에 있던 가장 먼저 실행된다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
	<% 
	// Java Code
	// JSP= java server page= java + http 제어
	String sname= "짱구";
	
	%>
	<h1><span style= "color: green"><%
		out.write(sname);
	%></span>님! 안녕하세요.</h1>
</body>
</html>
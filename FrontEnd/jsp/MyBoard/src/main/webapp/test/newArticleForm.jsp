<%@page import="article.model.Writer"%>
<%@page import="article.service.WriteRequest"%>
<%@page import="article.service.WriteArticleService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WriteService Test</title>
<%
	request.setCharacterEncoding("utf-8");
	String paramId= request.getParameter("id");
	String paramName= request.getParameter("name");
	
	if ( paramId != null || paramName != null) {
		Writer writer= new Writer(paramId, paramName);
		String title= request.getParameter("title");
		String content= request.getParameter("content");
	
		WriteRequest req= new WriteRequest(writer, title, content);
		WriteArticleService was= new WriteArticleService();
		was.write(req);
	}
%>
</head>
<body>
	<form action= "" method= "POST">
		작성자 : <input type= "text" name= "name"><br>
		작성자 ID : <input type= "text" name= "id"><br>
		글 제목 : <input type= "text" name= "title"><br>
		내용 : <textarea rows="10" cols="40" name= "content"></textarea>
		<hr>
		<input type= "submit" value= "글쓰기">
	</form>
</body>
</html>
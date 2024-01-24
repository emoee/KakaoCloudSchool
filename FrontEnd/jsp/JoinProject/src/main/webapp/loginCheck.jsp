<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	//request요청파악
	request.setCharacterEncoding("utf-8");
	String sid = request. getParameter("userid");
	String spw = request. getParameter("userpw");
	
	//비즈니스로직
		if((sid.equals("aaa")) &&(spw.equals("1234"))){
			//성공
			//응답코드
			request.setAttribute("req_userid",sid);
			session.setAttribute("s_userid",sid);//브라우저가 X표 누를때 수거됨.
			response.sendRedirect("success.jsp");
		}else{
			//실패
		}
 %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1> loginCheck.jsp</h1>
	ID : <%=sid %><br>
	PASSWORD: <%=spw %>
</body>
</html>
<%@page import="mycom.test.util.JdbcUitlity"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%// request 파악
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean scope="request" id= "member" class= "mycom.test.domain.MemberInfo">
	<jsp:setProperty name= "member" property= "*"/>
</jsp:useBean>
<%=member %>
<%
	/* 원래 이렇게 써야하지만 보안, 재사용 이슈로 자바코드로 작성하는 것이 더 좋다.
	String mid= request.getParameter("mid");
	String mpw= request.getParameter("mpw");
	String mname= request.getParameter("mname");
	String memail= request.getParameter("memail"); 
	
	PreparedStatement pstmt= null;
	pstmt.setString(1, mid);
	
	// SQL Injection
	mpw= "--";
	
	*/
	
	// db 연동
	Class.forName("org.mariadb.jdbc.Driver");
	Connection conn= null;
	PreparedStatement pstmt= null;
	int result= 0;
	
	String jdbcDriver = "jdbc:mariadb://localhost:3306/chap14?";
	String dbUser = "jspexam";
	String dbPass = "jsppw";

	// db 처리
	String sql= "insert into member(MEMBERID, PASSWORD, NAME, EMAIL) values(?,?,?,?)";

	try {
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		if (conn != null){
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpw());
			pstmt.setString(3, member.getMname());
			pstmt.setString(4, member.getMemail());
			
			result= pstmt.executeUpdate();
			if (result < 1) {
				out.write("정보 삽입 실패");
			}
		} else {
			out.write("DB 연동 실패..");
		}
	
	} catch (SQLException ex){
		ex.printStackTrace();
	} finally {
		JdbcUitlity.close(pstmt);
		JdbcUitlity.close(conn);
	}
	
	response.sendRedirect("login.html");
%>
<title>INSERT</title>
<%@page import="mycom.test.util.JdbcUtility"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean scope="request" id="member" class="mycom.test.domain.MemberInfo">
	<jsp:setProperty name="member" property="*" />
</jsp:useBean>

<%=member %>

<%
	// DB 연동
	Connection conn = null;
	PreparedStatement pstmt = null;
	int result = 0;
	
	String sql = "insert into member(memberid, password, name, email)" + 
				" values(?,?,?,?)";
	try {
		
		String jdbcDriver = "jdbc:mysql://localhost:3306/chap14?" +
				"useUnicode=true&characterEncoding=utf8";
		String dbUser = "jspexam";
		String dbPass = "jsppw";
		
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getMid());
		pstmt.setString(2, member.getMpw());
		pstmt.setString(3, member.getMname());
		pstmt.setString(4, member.getMemail());
		
		result = pstmt.executeUpdate();
		
		if (result < 1) {
			out.write("정보 삽입 실패");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		JdbcUtility.close(pstmt);
		JdbcUtility.close(conn);
	}

	response.sendRedirect("login.html");
%>
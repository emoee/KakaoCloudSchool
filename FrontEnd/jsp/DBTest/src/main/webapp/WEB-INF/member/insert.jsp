<%@page import="mycom.test.util.JdbcUtility"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean scope="request" id="mem" class="mycom.test.domain.MemberInfo">
	<jsp:setProperty name="mem" property="*" />
</jsp:useBean>

<%=mem %>

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
		pstmt.setString(1, mem.getMemberid());
		pstmt.setString(2, mem.getPassword());
		pstmt.setString(3, mem.getName());
		pstmt.setString(4, mem.getEmail());
		
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
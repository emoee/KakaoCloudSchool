<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLClientInfoException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	* 모든 과정은 예외처리를 설정한다. 
	* 1. jdbcDriver 로딩
	* 2. Connection 연결 설정
	* 3. Statement = sql 질의
	* 4. 결과처리
	* 5. 연결 해제
	*/
	Class.forName("org.mariadb.jdbc.Driver");
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String jdbcDriver = "jdbc:mariadb://localhost:3306/chap14?" +
			"useUnicode=true&characterEncoding=utf8";
	String dbUser = "jspexam";
	String dbPass = "jsppw";


	try {
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		if (conn != null){
			out.write("<h1>연결 성공</h1>");
		}
		stmt = conn.createStatement();
		String query = "select * from MEMBER order by MEMBERID";
		rs = stmt.executeQuery(query);

		while(rs.next()) {
%>
			<h1><%= rs.getString("name") %></h1>
			<h1><%= rs.getString("memberid") %></h1>
			<h1><%= rs.getString("email") %></h1>
<%		
		}
	} catch(SQLException ex) {
		out.println(ex.getMessage());
		ex.printStackTrace();
	} finally {if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
		if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	}
%>
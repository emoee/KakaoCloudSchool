<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date today= new Date();
	PrintWriter myout= response.getWriter();
	myout.write("<body><h1>myOut...</h1></body>");
%>
<h1><%out.write(today.getDate()+"!"); %></h1>
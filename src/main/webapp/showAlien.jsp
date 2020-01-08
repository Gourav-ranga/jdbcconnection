<%@page import="com.shootra.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
</head>

 <%
  Alien a1 = (Alien)request.getAttribute("alien");
  out.println(a1);
 %>
</body>
</html>
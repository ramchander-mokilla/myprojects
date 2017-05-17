<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Welcome to JSP</h3>
	<%
		out.print("Mokilla Ram Chander");
	%>
	
	<br></br>
	
	<%= "Anish Mokilla" %>
	
	<br></br>
	
	Current Time is <%= Calendar.getInstance().getTime() %>
	
	<br><br>Declaration Demo
	<%!
		int area(int l, int b)
		{
			return l*b;
		}
	%>
	<br>Area is : <%=area(21,23) %>
	
	<br></br>
	
	<%
		String name = request.getParameter("txtName");
		out.println("You entered "+name+" in the previous screen");
		pageContext.setAttribute("keyName", name, pageContext.SESSION_SCOPE);		
	%>
	
	<a href="welcome.jsp"><br><br><i>Click here to enter Welcome page</i></a>
		
</body> 
</html>
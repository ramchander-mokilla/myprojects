<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	int num = Integer.parseInt(request.getParameter("number"));

	for(int i=1; i<10; i++)
	{
		out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
	}

%>
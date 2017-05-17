<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    

<%
	String name = request.getParameter("name");
	
	String url = "jdbc:mysql://localhost/ram_test";
	String username = "root";
	String password = "";
	
	try 
	{
		//load the driver	
		Class.forName("com.mysql.jdbc.Driver");
		//Create the connection
		Connection connection = DriverManager.getConnection(url, username, password);
		String sql = "select * from student where name like '"+name+"%'";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		if(!rs.isBeforeFirst())
		{
			out.print("<p> No Record Found </p>");
		}
		else
		{
			out.print("<table border='1' cellpadding='2' width='100%'>");
			out.print("<tr><th><b>ID</b></th><th><b>RollNum</b></th><th><b>Name</b></th><th><b>Address</b></th></tr>");
			
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getInt(1)+
						"</td><td>"+rs.getInt(2)+
						"</td><td>"+rs.getString(3)+
						"</td><td>"+rs.getString(4)+
						"</td></tr>");
			}
			
			out.print("</table>");
		}
		
		connection.close();
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
%>
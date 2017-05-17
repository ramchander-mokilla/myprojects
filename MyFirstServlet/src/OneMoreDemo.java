

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OneMoreDemo
 */
@WebServlet("/OneMoreDemo")
public class OneMoreDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookieArr = request.getCookies();
		/*
		if(cookieArr!=null && cookieArr.length>0)
		{
			Cookie cookie = cookieArr[0];
			out.print("Hello "+cookie.getValue());
		}
		*/
		for(Cookie cookie : cookieArr)
		{			
			if(cookie.getName().equals("keyName"))
			{
				out.print("Hello "+cookie.getValue());
			}
		}
	}
}

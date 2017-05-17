package myFirstServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */

@WebServlet("/ServletOne")
//This Servlet does not implement GET (doGet) and can only handle POST (doPost)
public class ServletOne extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1092017690695008288L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public ServletOne(){
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();			
			String name = request.getParameter("txtName");
			out.print("Welcome "+name);
		}catch(Exception e){
			e.printStackTrace();
		}
		
						
	}
}

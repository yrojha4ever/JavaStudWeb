package javastud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username + " "+ password);
		
		if(username.equals("admin") && password.equals("admin")){
			//Success
			
			//Save user in session.
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30 * 60);
			session.setAttribute("activeUser", username);
			session.setAttribute("projectName", "Java Stud Web!");
			
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
			
		}else{
			//Error
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
			PrintWriter out = response.getWriter();
			out.println("<h2 style='color:red'>Sorry! Login Error.</h2>");
			
		}
		
		
		
		
	}

}

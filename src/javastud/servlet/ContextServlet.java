package javastud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/context")*/
public class ContextServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		//ServletContext: Gloabl(available to all servlet)
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("companyName");
		out.println("<h2> Your Company name is: "+ companyName + "</h2>");
		
		//ServletConfig: Servlet specific: Local
		ServletConfig config = getServletConfig();
		String serverName = config.getInitParameter("server");
		out.println("<hr><h2> Webapp is running on the server: " + serverName + "</h2>");
		
		
		out.println(new java.util.Date());
		
		
		
	}
	
}

package javastud.servlet.context.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextSetAttribute
 */
public class ServletContextSetAtt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextSetAtt() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Set Attribute:
		ServletContext context = getServletContext();
		context.setAttribute("company", "Java Envagilist");
		
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		out.println("<b>Welcome to ServletContextSetAttribute servlet. </b> <br/> <br/>");  
		out.println("<a href='contextGetAtt'>Info</a>");  
		out.close();
	}

}

package javastud.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");// setting the content type

		PrintWriter pw = resp.getWriter();// get the stream to write the data

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("<h3 style='color:green'>Welcome to Hello servlet</h3>");
		pw.println("<form action=\"home\" method=\"post\" style='border:1px solid;'>");  
		pw.println("Type anything....  <input type=\"text\" name=\"name\"/>");
		pw.println("<br/> <input type=\"submit\" value=\"Google Search\"/>");
		pw.println("</form>");
		pw.println("</body></html>");

		pw.close();// closing the stream

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String skeyword = request.getParameter("name");
		
		resp.setContentType("text/html");// setting the content type
		PrintWriter pw = resp.getWriter();// get the stream to write the data

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("<h3>Welcome to HelloServlet doPost :)</h3>");
		pw.println("You Search for keyword: <b><i>" + skeyword + "</i></b>");  
		pw.println("</br><a href='home'>Back to home</a>");
		pw.println("</body></html>");

		pw.close();// closing the stream
		
		
	}

}

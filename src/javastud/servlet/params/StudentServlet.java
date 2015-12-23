package javastud.servlet.params;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Read Parameter of Student.jsp
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");

		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter();// get the stream to write the

		// Writing html in the stream
		pw.println("<html><body>");
		pw.println("<h3>Welcome to Student Servlet: doPost :)</h3>");
		pw.println("Student Information: <br/> ");
		pw.println("ID: " + id + " Name:" + name + " Address:" + address
				+ " Gender:" + gender + " Country: " + country);
		pw.println("</br><a href='student.jsp'>Back to Student Form</a>");
		pw.println("</body></html>");
		
		pw.close();// closing the stream
	}

}

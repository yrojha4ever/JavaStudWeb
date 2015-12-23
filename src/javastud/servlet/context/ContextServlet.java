package javastud.servlet.context;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextServlet
 */
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContextServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("contextServlet.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userParam = request.getParameter("username");
		String passParam = request.getParameter("password");

		ServletContext context = getServletContext();
		String userContext = context.getInitParameter("username");
		String passwordContext = context.getInitParameter("password");

		if (userContext.equals(userParam) && passwordContext.equals(passParam)) {
			RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("/loginError.jsp");
			rd.include(request, response);

		}
	}

}

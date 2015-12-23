package javastud.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoggedInServlet")
public class LoggedInServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect("html/index.html");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//request.getRequestDispatcher("html/link.html").include(request, response);

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);

			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
		} else {
			out.print("sorry, username or password error!");
			out.print("<a href='LoggedInServlet'>Back to Login</a>");
		}

		out.close();
	}
}

package javastud.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WithoutSessionServlet")
public class WithoutSessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(5);
		session.setAttribute("currentUser", "ADMIN");
		
		PrintWriter out = resp.getWriter();
		out.println("Welcome: " + "ADMIN");
		out.println("<br/><hr><a href='WithSessionServlet'>Visit Page</a>");
		out.close();
	}
}

package javastud.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WithSessionServlet")
public class WithSessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String cuser = (String)session.getAttribute("currentUser");
		
		PrintWriter out = resp.getWriter();
		out.println(" Hello : " + cuser);
		
		out.println("<hr>User is fetch from Session. session.getAttribute(\"currentUser\")...");
		
	}
}

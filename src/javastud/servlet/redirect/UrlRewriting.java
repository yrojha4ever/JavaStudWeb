package javastud.servlet.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/google")
public class UrlRewriting extends HttpServlet {

	//Run: google.jsp, type google input and it will rewrite url.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String serachKey = req.getParameter("search");
		PrintWriter out = resp.getWriter();
		out.println("You are searching for <b>" + serachKey + "....</b>");
		out.println("<a href='https://www.google.com.np/search?q="+ serachKey + "'>Search in Google</a>");
	}
}

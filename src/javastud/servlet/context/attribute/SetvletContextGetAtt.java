package javastud.servlet.context.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextGetAtt")
public class SetvletContextGetAtt extends HttpServlet {

	private static final long serialVersionUID = -6673355307514549797L;

	public SetvletContextGetAtt() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// For GetServletContext Attribute. Which is set from
		// ServletContextSetAttribute
		PrintWriter out = resp.getWriter();
		ServletContext context = getServletContext();
		out.println("<br/> Company Name: " + context.getAttribute("company"));
	}

}

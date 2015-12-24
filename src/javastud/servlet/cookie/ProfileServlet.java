package javastud.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("clink.html").include(request, response);

		Cookie ck[] = request.getCookies();
		if (ck != null) {
			
			String name = null;
			for (int i = 0; i < ck.length; i++) {
				Cookie cke = ck[i];
				if(cke.getName().equals("name")){
					name = cke.getValue();
					break;
				}
			}
			
			if (name != null && !name.equals("")) {
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, " + name);
			}
		} else {
			out.print("Please login first");
			request.getRequestDispatcher("clogin.html").include(request,
					response);
		}
		out.close();
	}
}
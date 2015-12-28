package javastud.servlet.jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javastud.model.Address;
import javastud.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlCoreCSendAttr
 */
@WebServlet("/jstlcore")
public class JstlCoreCSendAttr extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", "RAM");
		
		Employee emp = getEmployee();
		request.setAttribute("employee", emp);
		
		List<String> richCountries = Arrays.asList("Usa","China","Japan","UK","Norway");
		request.setAttribute("richCountries", richCountries);
		
		request.getRequestDispatcher("jsp/jstl/jstlExample.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	private Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("John");

		Address address = new Address();
		address.setCity("Kathmandu");
		address.setState("Bagmati");
		address.setZip("0977");
		address.setCountry("Nepal");

		emp.setAddress(address);

		return emp;
	}
}

package javastud.servlet.el;

import java.io.IOException;

import javastud.model.Address;
import javastud.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el")
public class SendJspAttributeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("name", "RAM");
		
		Employee emp = getEmployee();
		req.setAttribute("employee", emp);
		
		req.getRequestDispatcher("jsp/el/attr.jsp").forward(req, resp);
	}
	
	private Employee getEmployee(){
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

package com.techlabs.controller.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.customer.Customer;
import com.techlabs.service.customer.CustomerService;

@WebServlet("/editCustomer")
public class EditCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditCustomer() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		String name = null, address = null;
		List<Customer> customers = CustomerService.getCustomers();
		for (Customer customer : customers) {
			if (id.equals(customer.getCustomerId())) {

				name = customer.getCustomerName();
				address = customer.getCustomerAddress();

			}

		}
		System.out.println(name);
		request.setAttribute("customerName", name);
		request.setAttribute("customerAddress", address);
		request.setAttribute("customerId", id);

		request.getRequestDispatcher("editCustomer.jsp").forward(request,
				response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("custId");
		String customerName = request.getParameter("custName");
		String customerAddress = request.getParameter("custAddress");
		
		CustomerService customerService = new CustomerService();
		customerService.updateCustomer(customerId, customerName,
				customerAddress);
		
		response.sendRedirect("/customer-service-app/customerController");
	}

}

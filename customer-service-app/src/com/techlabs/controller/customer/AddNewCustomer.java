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

@WebServlet("/addNewCustomer")
public class AddNewCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddNewCustomer() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addCustomer.jsp").forward(request,
				response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("custId");
		String customerName = request.getParameter("custName");
		String customerAddress = request.getParameter("custAddress");

		request.setAttribute("customerId", customerId);
		request.setAttribute("customerName", customerName);
		request.setAttribute("customerAddress", customerAddress);

		CustomerService customerService = new CustomerService();
		List<Customer> customers = CustomerService.getCustomers();

		request.setAttribute("customers", customers);
		customerService.addCustomer(customerId, customerName, customerAddress);

		response.sendRedirect("/customer-service-app/customerController");
	}

}

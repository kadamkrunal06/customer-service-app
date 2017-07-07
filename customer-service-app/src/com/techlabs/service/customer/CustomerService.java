package com.techlabs.service.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	private static List<Customer> customers = new ArrayList<Customer>();

	
	

	public void printCustomers() {
		for (Customer cust : getCustomers()) {
			System.out.println("Customer Name: " + cust.customerName + " Id: "
					+ cust.customerId);
		}
	}

	public void addCustomer(String customerId, String name, String address) {
		CustomerService.getCustomers().add(new Customer(customerId, name, address));
	}

	public void updateCustomer(String customerId, String name, String address) {
		for (Customer cust : getCustomers()) {
			if (cust.getCustomerId().equals(customerId)) {
				cust.setCustomerAddress(address);
				cust.setCustomerName(name);
			}
		}
	}
	
	public void deleteCustomer(String customerId){
		List<Customer> toDelete = new ArrayList<Customer>();
		for (Customer cust1 : getCustomers()) {
			if (customerId.equalsIgnoreCase(cust1.getCustomerId())) {
				toDelete.add(cust1);
			}
		}
		getCustomers().removeAll(toDelete);
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static void setCustomers(List<Customer> customers) {
		CustomerService.customers = customers;
	}
}

package com.techlabs.service.customer;

public class Customer {

	String customerId;
	String customerName, customerAddress;

	public Customer(String customerId, String customerName,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	@Override
	public String toString() {

		return "Customer Id: " + customerId + " Name: " + customerName
				+ " Address " + customerAddress;
	}

}

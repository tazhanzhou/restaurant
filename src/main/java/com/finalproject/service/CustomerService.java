package com.finalproject.service;

import java.util.List;

import com.finalproject.model.CustomerEntity;

public interface CustomerService {

	public List<CustomerEntity> getCustomers(); // Read

	public boolean addCustomer(CustomerEntity customer);

	public CustomerEntity getCustomerById(int customerId); // Read

	public boolean deleteCustomer(int customerId); // DELETE

	public boolean updateCustomer(CustomerEntity customer); // UPDATE
	

}

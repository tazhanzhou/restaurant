package com.finalproject.dao;

import java.util.List;

import com.finalproject.model.CustomerEntity;
import com.finalproject.model.OrderEntity;

public interface CustomerDao {

	public List<CustomerEntity> getCustomers(); // Read

	public CustomerEntity getCustomerById(int customerId); // Read

	public int insertCustomer(CustomerEntity customer); // Create

	public boolean deleteCustomer(int customerId); // DELETE

	public boolean updateCustomer(CustomerEntity customer); // UPDATE
	
}

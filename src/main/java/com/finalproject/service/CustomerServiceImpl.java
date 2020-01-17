package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.dao.CustomerDao;
import com.finalproject.model.CustomerEntity;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;

	@Override
	public List<CustomerEntity> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public boolean addCustomer(CustomerEntity customer) {
		return customerDao.insertCustomer(customer) > 0 ;
	}

	@Override
	public CustomerEntity getCustomerById(int customerId) {
		return customerDao.getCustomerById(customerId);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return customerDao.deleteCustomer(customerId);
	}

	@Override
	public boolean updateCustomer(CustomerEntity customer) {
		return customerDao.updateCustomer(customer);
	}


}

package com.finalproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.model.CustomerEntity;

@Repository
public class HibernateCustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<CustomerEntity> getCustomers() {
		return getSession().createQuery("from CustomerEntity", CustomerEntity.class).list();
	}

	@Override
	public int insertCustomer(CustomerEntity customer) {
		sessionFactory.getCurrentSession().save(customer);
		return 1;
	}

	@Override
	public CustomerEntity getCustomerById(int idCustomer) {
		return (CustomerEntity) getSession().get(CustomerEntity.class, idCustomer);
	}

	@Override
	public boolean deleteCustomer(int idCustomer) {
		CustomerEntity fetchedCustomer = getCustomerById(idCustomer);
		getSession().delete(fetchedCustomer);
		return true;
	}

	@Override
	public boolean updateCustomer(CustomerEntity customer) {
		getSession().update(customer);
		return true;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}

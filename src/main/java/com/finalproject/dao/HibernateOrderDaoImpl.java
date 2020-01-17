package com.finalproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.model.OrderEntity;

@Repository
public class HibernateOrderDaoImpl implements OrderDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<OrderEntity> getOrders() {
		return getSession().createQuery("from OrderEntity", OrderEntity.class).list();
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<OrderEntity> getOrdersByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}

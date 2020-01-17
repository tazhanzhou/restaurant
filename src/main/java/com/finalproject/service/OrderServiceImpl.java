package com.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.dao.OrderDao;
import com.finalproject.model.OrderEntity;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;

	@Override
	public List<OrderEntity> getOrders() {
		return orderDao.getOrders();
	}

	@Override
	public List<OrderEntity> getOrdersByCustomerId(int customerId) {
		return orderDao.getOrdersByCustomerId(customerId);
	}
}

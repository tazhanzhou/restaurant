package com.finalproject.dao;

import java.util.List;

import com.finalproject.model.OrderEntity;

public interface OrderDao {
	public List<OrderEntity> getOrders(); // Read
	
	public List<OrderEntity> getOrdersByCustomerId(int customerId);
}

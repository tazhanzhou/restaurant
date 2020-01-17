package com.finalproject.service;

import java.util.List;

import com.finalproject.model.OrderEntity;

public interface OrderService {
	public List<OrderEntity> getOrders(); // Read
	
	public List<OrderEntity> getOrdersByCustomerId(int customerId);
}

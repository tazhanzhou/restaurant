package com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.model.OrderEntity;
import com.finalproject.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/getorders", method = RequestMethod.GET)
	public ModelAndView getCustomersList() {
		ModelAndView modelView = new ModelAndView("OrderList");

		List<OrderEntity> orders = orderService.getOrders();
		modelView.addObject("orderList", orders);

		return modelView;
	}
}

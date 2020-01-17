package com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.model.CustomerEntity;
import com.finalproject.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping(value = "/getcustomers", method = RequestMethod.GET)
	public ModelAndView getCustomersList() {
		ModelAndView modelView = new ModelAndView("CustomerList");

		List<CustomerEntity> customers = customerService.getCustomers();
		modelView.addObject("customerList", customers);
		modelView.addObject("customer", new CustomerEntity());

		return modelView;
	}

	@RequestMapping(value = "addcustomer")
	public ModelAndView addCustomer() {
		ModelAndView mv = new ModelAndView("AddCustomer");
		mv.addObject("customer", new CustomerEntity());
		return mv;
	}

	@RequestMapping(value = "saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") CustomerEntity customer) {
		if (customerService.addCustomer(customer))
			return "redirect:/customers/getcustomers";
		else {
			return "ErrorPage";
		}
	}
	@RequestMapping(value = "deletecustomer")
	public String deleteStudent(@RequestParam("customerId") int customerId) {
		if (customerService.deleteCustomer(customerId)) {
			return "redirect:/customers/getcustomers";
		}
		else {
			return "ErrorPage";
		}
	}
	@RequestMapping(value = "editcustomer")
	public ModelAndView editCustomer(@RequestParam("customerId") int customerId) {
		ModelAndView mv = new ModelAndView("UpdateCustomer");
		CustomerEntity fetchedCustomer = customerService.getCustomerById(customerId);
		mv.addObject("editcustomer", fetchedCustomer);
		return mv;
	}

	@RequestMapping(value = "UpdateCustomer")
	public String updateCustomer(@ModelAttribute("customer") CustomerEntity customer) {
		if (customerService.updateCustomer(customer)) {
			return "redirect:/customers/getcustomers";
		} else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "seeOrders")
	public ModelAndView getOrdersByCustomerId(@RequestParam("customerId") int customerId) {
		
		ModelAndView mv = new ModelAndView("CustomerHasOrders");
		
		return mv;
	}
}

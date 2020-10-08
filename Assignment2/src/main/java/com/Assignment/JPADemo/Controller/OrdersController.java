package com.Assignment.JPADemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.JPADemo.Repository.CustomerRepo;
import com.Assignment.JPADemo.model.Customer;

@RestController
public class OrdersController {
	@Autowired
	CustomerRepo customerRepo;

	@PostMapping("/purchase")
	public String purchase(@RequestBody Customer customer) {
		customerRepo.save(customer);
		return "Order Purchased";
	}
}

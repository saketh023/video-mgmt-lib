package com.example.customerservice.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.customer.model.Customer;
import com.example.customer.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.allcustomer();
		
	}
	@PostMapping("/addcustomer")
	public String addcustomer(@RequestBody Customer c) {
		return service.addcustomer(c);
		
	}
	@DeleteMapping("/deletecustomer/{id}")
	public String delmovie(@PathVariable("id")int id)
	{
		service.deletecustomer(id);
		return"customer deleted";
	}
}

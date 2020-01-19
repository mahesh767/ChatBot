package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@Autowired
	public Customerrepository cust;
	
	
	@RequestMapping(value="/checkLogin" ,method=RequestMethod.GET)
	public Customer checkLogin(@RequestParam("email") String email)
	{
		Customer obj=cust.findByEmail(email);
		return obj;
				
	}
	
	
	
	@RequestMapping(value="/checkEmail",method=RequestMethod.GET)
	public Customer checkEmail(@RequestParam("email") String email)
	{
		Customer custobj=cust.findByEmail(email);

		return custobj;
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST,consumes="application/json")
	public void addUser(@RequestBody  Customer custobj)
	{
		cust.save(custobj);
	}
	
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.web.bind.annotation.*;
import java.util.*;
@Controller
public class CustomerController {
	@Autowired
	private Customerrepository cusrep;
	

	
	
	
	
	
	
	
	
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public String visitLogin()
	{
		return "login";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String visitRegister()
	{
		return "register";
	}
	
	
	
	
	
	
	
	
	
	
	
}

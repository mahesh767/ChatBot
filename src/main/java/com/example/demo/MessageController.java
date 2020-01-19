package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.mongodb.util.JSON;
@Controller
public class MessageController {
	@Autowired
	MessageRepository msg;

	
	@GetMapping("/getMessage")
	public String getMessages()
	{
		return "message";
	}
	
	
	
	
	
		
	
	
		
		
		
		
	}
	
	
	
	
	


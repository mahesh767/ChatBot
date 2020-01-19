package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageRestController {

	@Autowired
	public MessageRepository msg;
	
	
	
	@RequestMapping(value="/getMessageResponse" ,method=RequestMethod.GET)
	public Message getMessages(@RequestParam("messageId") String id)
	{
		
		Message obj=msg.findByMessageId(id);
		System.out.println(obj);
		
		return obj;
	}
	
	
}

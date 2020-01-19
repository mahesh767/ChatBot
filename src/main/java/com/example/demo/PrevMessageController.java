package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrevMessageController {
	@Autowired
	public PrevMessageRepository prep;
	
	@RequestMapping(value="/getPrevMessages", method=RequestMethod.GET)
	public PrevMessage getPrevMessages(@RequestParam("email") String email)
	{
		PrevMessage obj=prep.findByEmail(email);
		if(obj==null)
			System.out.print("null");
		else
			System.out.print("something");
		
		return obj;
	}
	
	@RequestMapping(value="/updateMessages",method=RequestMethod.GET)
	public void insertMessages(@RequestParam("email") String email,@RequestParam("messages") String message)
	{
		PrevMessage obj=prep.findByEmail(email);
		if(obj==null)
		{
			PrevMessage newobj=new PrevMessage(email,message);
			prep.save(newobj);
		}
		else
		{
			String prevmessages=obj.getMessages();
			message=prevmessages+","+message;
			obj.setMessages(message);
			prep.save(obj);
			
		}
		
	}
	
	
}

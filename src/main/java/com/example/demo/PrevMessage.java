package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="prevmessages")
public class PrevMessage {
	@Id
	String email;
	String messages;
	public PrevMessage(String email, String messages) {
		super();
		this.email = email;
		this.messages = messages;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessages() {
		return messages;
	}  
	public void setMessages(String messages) {
		this.messages = messages;
	}
	
	
	
	
	
	
	
}

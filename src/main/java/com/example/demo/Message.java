package com.example.demo;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Message")
public class Message {
	@Id
	public String messageId;
	public String messages;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public Message()
	{
		super();
	}
	public Message(String messageId, String messages) {
		super();
		this.messageId = messageId;
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", messages=" + messages + "]";
	}
	
	
	
	
	
}

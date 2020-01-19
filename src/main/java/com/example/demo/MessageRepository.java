package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.*;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message,String>{
	Message findByMessageId(String messageId);
}	

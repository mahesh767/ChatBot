package com.example.demo;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface PrevMessageRepository extends MongoRepository<PrevMessage,String> {
	PrevMessage findByEmail(String email);
}

package com.rdops.microservice.mongocrudservice.mongosample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rdops.microservice.mongocrudservice.mongosample.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findOneByName(String name);
	
	public User findOneById(String id);
}

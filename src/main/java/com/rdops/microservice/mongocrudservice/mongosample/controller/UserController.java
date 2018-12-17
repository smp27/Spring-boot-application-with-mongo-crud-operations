package com.rdops.microservice.mongocrudservice.mongosample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rdops.microservice.mongocrudservice.mongosample.model.User;
import com.rdops.microservice.mongocrudservice.mongosample.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	//Create
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody User user) {
		userRepository.save(user);
	}
	
	//Read
	@RequestMapping(value="/{id}")
	public User read(@PathVariable String id) {
		return userRepository.findOneById(id);
	}
	
	//Update
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user) {
		userRepository.save(user);
	}
	
	//Delete
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void delete(@PathVariable String id) {
		userRepository.deleteById(id);
	}
	
}

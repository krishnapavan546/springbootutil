package org.pavan.springbootutil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.pavan.springbootutil.bean.*;

@RestController
public class PersonController {

	
	ResponseEntity<?> response;
	@Autowired
	PersonService service;
	@PostMapping("/person")
	public ResponseEntity<?> addPerson(@RequestBody Person person)
	{
		response= new ResponseEntity<>(new String(),HttpStatus.ACCEPTED);		
		service.addPet(1L,"tommy");
		return response;
	}
	@GetMapping
	public List<Person> getPersons()
	{
		return service.getPersons();
	}
	
}

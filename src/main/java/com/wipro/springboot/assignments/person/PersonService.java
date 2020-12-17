package com.wipro.springboot.assignments.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springboot.assignments.error.PersonNotFoundException;

@Service
public class PersonService {
	
	PersonService personService;
	
	@Autowired
	private PersonRepository personRepo;
	
	
	public Person enrollPerson(Person person) {
		return personRepo.save(person);
		
	}
	
	public Object retrievePerson(String id) {
		
		var val=personRepo.findById(id);
		
		if(val.isPresent()) {
			return personRepo.findById(id);
		}
		else {
			throw new PersonNotFoundException();
		}
}
}

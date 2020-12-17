package com.wipro.springboot.assignments.person;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
		@Autowired
		private PersonService personService;

		@RequestMapping(value="/person", method=RequestMethod.POST)
		@ResponseBody
		public String enrollPerson(@RequestBody Person person ) {
		return personService.enrollPerson(person).getUID();
		}
		
		@RequestMapping(value="/person/{id}", method=RequestMethod.GET)
			public Object retrievePerson(@PathVariable("id") String id ) {
				return personService.retrievePerson(id);	
		}
		
}

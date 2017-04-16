package com.akc.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.akc.model.Person;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG=LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {
		ArrayList<Person> people=new ArrayList<>();
		people.add(new Person("Juan","34"));
		people.add(new Person("Jorge","54"));
		people.add(new Person("Rene","49"));
		people.add(new Person("Edwim","26"));
		people.add(new Person("Herney","38"));
		people.add(new Person("Armando","47"));
		LOG.info("este es el mensaje:"+people);
		return people;
	}

}

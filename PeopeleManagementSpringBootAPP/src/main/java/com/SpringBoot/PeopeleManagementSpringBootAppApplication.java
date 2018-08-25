package com.SpringBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBoot.Entities.Person;
import com.SpringBoot.Service.PeopleManagementService;

@SpringBootApplication
public class PeopeleManagementSpringBootAppApplication implements CommandLineRunner
{

	@Autowired
	private PeopleManagementService peopleManagementService;
	public static void main(String[] args) {
		SpringApplication.run(PeopeleManagementSpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//createPerson();
		//createPersons();
		//getPersonsByIds();
		//deletePersonEntity();
		updatePersonEmailById();
	}
	public void updatePersonEmailById()
	{
		peopleManagementService.updatePersonEmailById(3,"new2018@gmail.com");
	}
	public void deletePersonEntity()
	{
		Person person = new Person();
		person.setId(4);
		peopleManagementService.deletePersonEntity(person);
	}
	
	public void getPersonsByIds()
	{
		List<Integer> ids = new ArrayList<>();
		ids.add(4);
		ids.add(3);
		ids.add(20);
		Iterable<Person> personList = peopleManagementService.getPersonsByIds(ids);
		personList.forEach(System.out::println);
	}
	
	public void createPersons()
	{
		List<Person> personList = Arrays.asList(new Person("NAVI", "ravi", "i@gmail.com", new Date()),
				new Person("johi", "ravi", "vi@gmail.com", new Date()));
		Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
		for (Person person : createPersons) {
			System.out.println(person);
		}
	}
	
	
	public void createPerson()
	{
		Person person1 = new Person("sai", "ravi", "ravi@gmail.com", new Date());
		Person personDb = peopleManagementService.createPerson(person1);
		System.out.println(personDb);
	}
}

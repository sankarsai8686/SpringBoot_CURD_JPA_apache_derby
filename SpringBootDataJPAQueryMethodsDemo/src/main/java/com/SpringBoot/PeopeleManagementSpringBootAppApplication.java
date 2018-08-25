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
	public void run(String... arg0) throws Exception
	{
		//getPersonsInfoByLastName();
		getPerdonsInfoByFirstNameAndEmail();
	}
	
	public void getPerdonsInfoByFirstNameAndEmail()
	{
		List<Person> personList = peopleManagementService.getPerdonsInfoByFirstNameAndEmail("sai","ravi@gmail.com");
		personList.forEach(System.out::println);
	}
	
	
	public void getPersonsInfoByLastName()
	{
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("ravi");
		personList.forEach(System.out::println);
	}
	
	
}

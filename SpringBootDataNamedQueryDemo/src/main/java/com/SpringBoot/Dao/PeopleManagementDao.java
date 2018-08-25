package com.SpringBoot.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.SpringBoot.Entities.Person;

/*@org.springframework.stereotype.Repository*/
public interface PeopleManagementDao extends CrudRepository<Person, Integer>
//extends Repository<Person,Integer>
// Repository is a marker interface it does not contains any methods.
{
	
	
	List<Person> getPersonByLastName(String lastName);
	
	List<Person> getPersonByFirstNameAndEmail(String firstName,String email);

}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
package com.SpringBoot.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.SpringBoot.Entities.Person;

/*@org.springframework.stereotype.Repository*/
public interface PeopleManagementDao extends JpaRepository<Person, Integer>
//extends Repository<Person,Integer>
// Repository is a marker interface it does not contains any methods.
{
	
	//@Query(value="SELECT p FROM Person p where p.lastName=?1")
	@Query(value="SELECT * FROM person_table WHERE last_name=?1",nativeQuery=true)
	List<Person> getPersonByLastName(String lastName);
	
	//@Query(value="SELECT p FROM Person p where p.firstName=?1 AND p.email=?2")
	@Query(value="SELECT * FROM person_table WHERE first_name=?1 AND email=?2",nativeQuery=true)
	List<Person> getPersonByFirstNameAndEmail(String firstName,String email);

}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
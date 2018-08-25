package com.SpringBoot.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.SpringBoot.Entities.Person;

/*@org.springframework.stereotype.Repository*/
public interface PeopleManagementDao extends JpaRepository<Person, Integer>
//extends Repository<Person,Integer>
// Repository is a marker interface it does not contains any methods.
{
	@Transactional
	@Modifying
	@Query(value = "UPDATE Person set email=:newEmail where id=:personId")
	void updatePersonEmailByID(@Param("personId")int  id, @Param("newEmail") String newEmail);
	
	

}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
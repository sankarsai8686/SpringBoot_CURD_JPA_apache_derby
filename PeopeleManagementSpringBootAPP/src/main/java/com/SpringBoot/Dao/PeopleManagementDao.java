package com.SpringBoot.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Entities.Person;

@Repository
public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}

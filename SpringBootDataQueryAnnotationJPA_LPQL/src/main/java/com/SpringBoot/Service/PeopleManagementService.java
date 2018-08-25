package com.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Dao.PeopleManagementDao;
import com.SpringBoot.Entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleManagementDao.getPersonByLastName(lastName);
	}

	public List<Person> getPerdonsInfoByFirstNameAndEmail(String firstName, String email) {
		// TODO Auto-generated method stub
		return peopleManagementDao.getPersonByFirstNameAndEmail(firstName, email);
	}
	
	

}

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
	
	public Person createPerson(Person person1) {
		
		return peopleManagementDao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManagementDao.save(personList);
		return list;
	}

	public Iterable<Person> getPersonsByIds(List<Integer> ids) {
		
		return peopleManagementDao.findAll(ids);
	}

	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);;
	}

	public void updatePersonEmailById(int i, String string) {
		Person person = peopleManagementDao.findOne(i);
		if(i == person.getId())
		{
			person.setEmail(string);
		}
		peopleManagementDao.save(person);
	}

}

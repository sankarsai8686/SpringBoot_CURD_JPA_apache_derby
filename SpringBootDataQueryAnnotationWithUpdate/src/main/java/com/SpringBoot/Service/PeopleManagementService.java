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

	public void updatePersonEmailByID(int id, String newEmail) {
		
		peopleManagementDao.updatePersonEmailByID(id,newEmail);
	}

	
	
	

}

package com.nextlearn.portfolio.services;

import java.util.List;

import com.nextlearn.portfolio.dto.ContactDto;
import com.nextlearn.portfolio.entities.ContactEntity;

public interface ContactService {
	
	ContactEntity saveContact(ContactDto contactDto);
	boolean isContactEmailExist(String email);
	
	List<ContactEntity> readAllContacts();
	
	void deleteContactById(int id);
}

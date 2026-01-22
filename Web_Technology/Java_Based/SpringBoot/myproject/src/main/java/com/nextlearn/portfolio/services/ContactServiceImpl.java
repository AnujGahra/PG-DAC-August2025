package com.nextlearn.portfolio.services;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlearn.portfolio.dto.ContactDto;
import com.nextlearn.portfolio.entities.ContactEntity;
import com.nextlearn.portfolio.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ContactEntity saveContact(ContactDto contactDto) {
		
		
//		ContactEntity contactEntity = new ContactEntity();
//		contactEntity.setName(contactDto.getName());
//		contactEntity.setEmail(contactDto.getEmail());
//		contactEntity.setSubject(contactDto.getSubject());
//		contactEntity.setMessage(contactDto.getMessage());
//		contactEntity.setDatetime(LocalDateTime.now().toString());
		
		
		ContactEntity contactEntity = modelMapper.map(contactDto, ContactEntity.class);
		contactEntity.setDatetime(LocalDateTime.now().toString());

		return contactRepository.save(contactEntity );
	}

	@Override
	public boolean isContactEmailExist(String email) {
		// TODO Auto-generated method stub
		return contactRepository.existsByEmail(email);
	}

	@Override
	public List<ContactEntity> readAllContacts() {
		
		return contactRepository.findAll();
	}

	@Override
	public void deleteContactById(int id) {
		
		contactRepository.deleteById(id);
		
		
	}

}

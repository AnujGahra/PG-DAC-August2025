package com.nextlearn.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nextlearn.portfolio.entities.ContactEntity;



@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
	
	
	boolean existsByEmail(String email);
}

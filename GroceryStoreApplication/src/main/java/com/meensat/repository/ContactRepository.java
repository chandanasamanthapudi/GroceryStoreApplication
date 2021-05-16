package com.meensat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.Contact;

public interface ContactRepository extends CrudRepository <Contact, Long> {
	

	Contact findByUserUserId(long userId);
	
	List<Contact> findByMobilePhone(String mobileNumber);

}

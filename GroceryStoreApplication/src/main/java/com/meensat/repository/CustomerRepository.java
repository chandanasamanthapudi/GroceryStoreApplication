package com.meensat.repository;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	Customer findByUserUserId(long userId);
	
}

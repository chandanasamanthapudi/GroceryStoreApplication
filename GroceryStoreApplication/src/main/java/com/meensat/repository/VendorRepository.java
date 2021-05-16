package com.meensat.repository;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
	
	Vendor findByUserUserId(long userId);

}

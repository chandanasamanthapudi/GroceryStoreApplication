package com.meensat.repository;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.Country;

public interface CountryRepository extends CrudRepository<Country, Long > {

	Country findByCountryId(int country);
	

	
	

}

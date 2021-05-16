package com.meensat.repository;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.State;

public interface StateRepository extends CrudRepository<State, Integer> {

   
	State findByNameAndCountryCountryId(String stateName, int countryId);

	State findByStateId(int stateId);

	State findByStateIdAndCountryCountryId(int stateId, int countryId);

}
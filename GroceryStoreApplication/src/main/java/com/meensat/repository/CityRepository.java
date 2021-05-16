package com.meensat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.City;

public interface CityRepository extends CrudRepository<City, Integer> {

	List<City> findAllCitiesByStateId(int stateId);

	City findByStateStateIdAndName(int stateId, String city);

	City findByCityIdAndStateStateId(int cityId, int stateId);


}

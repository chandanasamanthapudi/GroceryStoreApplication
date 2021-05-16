package com.meensat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meensat.Usersmodel.Admin;
import com.meensat.Usersmodel.City;
import com.meensat.Usersmodel.Contact;
import com.meensat.Usersmodel.Country;
import com.meensat.Usersmodel.Customer;
import com.meensat.Usersmodel.State;
import com.meensat.Usersmodel.User;
import com.meensat.Usersmodel.Vendor;
import com.meensat.repository.AdminRepository;
import com.meensat.repository.CityRepository;
import com.meensat.repository.ContactRepository;
import com.meensat.repository.CountryRepository;
import com.meensat.repository.CustomerRepository;
import com.meensat.repository.StateRepository;
import com.meensat.repository.UserRepository;
import com.meensat.repository.VendorRepository;

@Service
//@Transactional
public class CommonService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ContactRepository contactRepository;


	public List<User> getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public List<City> getAllCitiesListByStateId(int stateId) {
		return cityRepository.findAllCitiesByStateId(stateId);
	}
	
	public Country getCountryById(int country) {
		return countryRepository.findByCountryId(country);
	}

	public State getStateByName(String stateName, int countryId) {
		return stateRepository.findByNameAndCountryCountryId(stateName, countryId);
	}

	public City getCityByName(int stateId, String city) {
		return cityRepository.findByStateStateIdAndName(stateId, city);
	}

	public State saveState(State state) {
		return stateRepository.save(state);
	}

	public City saveCity(City city) {
		return cityRepository.save(city);
	}
	
	public List<Contact> getContactByMobileNumber(String mobileNumber) {
		return contactRepository.findByMobilePhone(mobileNumber);
	}
	
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
}
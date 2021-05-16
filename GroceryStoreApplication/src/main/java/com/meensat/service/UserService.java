package com.meensat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meensat.Usersmodel.City;
import com.meensat.Usersmodel.Contact;
import com.meensat.Usersmodel.Country;
import com.meensat.Usersmodel.State;
import com.meensat.Usersmodel.User;
import com.meensat.Usersmodel.UserInfo;
import com.meensat.repository.CityRepository;
import com.meensat.repository.ContactRepository;
import com.meensat.repository.CountryRepository;
import com.meensat.repository.StateRepository;
import com.meensat.repository.UserInfoRepository;
import com.meensat.repository.UserRepository;

@Service
//@Transactional
public class UserService {

	
		@Autowired
		private UserRepository userRepository;

		@Autowired
		private UserInfoRepository userInfoRepository;
		
		@Autowired
		private CountryRepository countryRepository;

		@Autowired
		private StateRepository stateRepository;
		
		@Autowired
		private CityRepository cityRepository;

		@Autowired
		private ContactRepository contactRepository;
		
		public User getUserById(long userId) {
			return userRepository.findByUserId(userId);
		}

		public User saveUser(User user) {
			return userRepository.save(user);
		}

		public UserInfo saveUserinfo(UserInfo userInfo) {
			return userInfoRepository.save(userInfo);
		}
		
		public Contact saveContact(Contact contact) {
			return contactRepository.save(contact);
		}

		public Contact getContactByUserId(long userId) {
			return contactRepository.findByUserUserId(userId);
		}
		
		public State getStateById(int stateId, int countryId) {
			return stateRepository.findByStateIdAndCountryCountryId(stateId, countryId);
		}
		
		public City getCityById(int cityId, int stateId) {
			return cityRepository.findByCityIdAndStateStateId(cityId, stateId);
		}
		
		public Country getCountryById(int countryId) {
			return countryRepository.findByCountryId(countryId);
		}


		public List<User> getUserByEmail(String email) {
			return userRepository.findByEmail(email);
		}
		
		public List<Contact> getContactByMobileNumber(String mobileNumber) {
			return contactRepository.findByMobilePhone(mobileNumber);
		}
}
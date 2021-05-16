package com.meensat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.User;

public interface UserRepository extends CrudRepository<User, Long> {

	
	List<User> findByEmail(String email);
	
	List<User> findByRoleContains(String role);
	
	User findByEmailAndRoleIn(String email, List<String> roles);

	User findByUserId(long userId);
	
}
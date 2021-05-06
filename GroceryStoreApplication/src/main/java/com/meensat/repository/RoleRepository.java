package com.meensat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meensat.Usersmodel.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	
	
	
}
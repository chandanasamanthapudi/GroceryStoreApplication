package com.meensat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meensat.Usersmodel.User;
import com.meensat.Usersmodel.Vendor;


@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

	
	@Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
	
	
}

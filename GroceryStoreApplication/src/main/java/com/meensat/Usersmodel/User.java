package com.meensat.Usersmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private long userId;


	@Column(name = "email", nullable = false, unique = true, updatable = false, length = 150)
	private String email;	

	
	@Column(name = "password", nullable = false, unique = false, length = 200)
	private String password;

	
	@Column(name = "username", nullable = true, unique = true, updatable = false, length = 100)
	private String userName;

	
	@Column(name = "role", nullable = false, length = 50)
	private String role;
        
    @Column(name = "active", nullable = false)
	private byte active;

    @Column(name = "must_change_password", nullable = false)
	private byte mustChangePassword;

	@Column(name = "is_profile_updated", nullable = false)
	private byte isProfileUpdated;

    @Column(name = "email_verfied", nullable = false)
	private byte emailVerified;
    
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Contact contact;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private UserInfo userInfo;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Vendor vendor;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Admin admin;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Customer customer;
}
         
package com.meensat.Usersmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id", nullable = false)
	private long contactId;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = true)
	private City city;

	@ManyToOne
	@JoinColumn(name = "state_id", nullable = true)
	private State state;

	@ManyToOne
	@JoinColumn(name = "country_id", nullable = true)
	private Country country;

	@Column(name = "address_1", nullable = true, length = 200)
	private String address;
	
	@Column(name = "pincode", nullable = true, length = 10)
	private String pincode;

	@Column(name = "mobile_phone", nullable = true, length = 20)
	private String mobilePhone;
 	
	@Column(name = "city_name", nullable = true)
	private String cityName;
}	


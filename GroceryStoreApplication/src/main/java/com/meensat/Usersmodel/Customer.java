package com.meensat.Usersmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id" , nullable = false )
	private Long Id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@Column(name = "phone_number", nullable = false)
	private Long phoneNumber;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "latitude", nullable = false)
	private double latitude;
	
	@Column(name= "address", nullable= false)
	private String address;
	
	@Column(name = "logitude", nullable = false)
	private double logitude;
}
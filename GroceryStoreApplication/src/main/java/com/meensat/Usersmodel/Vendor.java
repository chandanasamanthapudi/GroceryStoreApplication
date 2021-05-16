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
@Table(name = "vendor")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "number", nullable = false)
	private Long phoneNumber;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "dailog", nullable = false)
	private String dialog;
	
	@Column(name = "image", nullable = false)
	private byte[] image;
	
	@Column(name = "shop_name", nullable = false)
	private String shopName;
	
	@Column(name = "shop_open", nullable = false)
	private boolean shopOpen;
	
	@Column(name = "is_top_picked", nullable = false)
	private boolean isTopPicked;
	
	@Column(name = "rating", nullable = false)
	private int rating;
	
	@Column(name = "acc_verrified", nullable = false)
	private boolean accVerified;
	
	@Column(name = "total_rating", nullable = false)
	private int totalRating;
}
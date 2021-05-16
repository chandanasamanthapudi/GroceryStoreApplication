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
@Table(name = "user_info")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_info_id", nullable = false)
	private long userInfoId;
        
    @OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
        
	@Column(name = "User_name", nullable = true, length = 200)
	private String UserName;

	
	@Column(name = "prefix", nullable = true, length = 10)
	private String prefix;

	
	@Column(name = "suffix", nullable = true, length = 10)
	private String suffix;

	
	@Column(name = "first_name", nullable = true, length = 100)
	private String firstName;

	
	@Column(name = "middle_initial", nullable = true, length = 20)
	private String middleInitial;

	@Column(name = "last_name", nullable = true, length = 100)
	private String lastName;
	
	@Column(name = "photo", nullable = true, length = 150)
	private String photo;
	
	@Column(name = "display_Name", nullable = true, length = 200)
	private String displayName;

	@Column(name = "geo_location", nullable = true, length = 200)
	private String geoLocation;

}

package com.meensat.Usersmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "country_id", nullable = false)
		private int countryId;

		@Column(name = "name", nullable = false, length = 150)
		private String name;

}

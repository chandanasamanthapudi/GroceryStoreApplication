package com.meensat.Usersmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "city_id", nullable = false)
		private int cityId;

		@Column(name = "name", nullable = false, length = 100)
		private String name;

		@Column(name = "active", nullable = false)
		private byte active;

		@ManyToOne
		@JoinColumn(name = "state_id", nullable = false)
		private State state;

	}

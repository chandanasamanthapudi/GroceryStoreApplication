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
@Table(name = "states")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id", nullable = false)
	private int stateId;
	
	@Column(name = "name", nullable = false, length = 300)
	private String name;

	@Column(name = "active", nullable = false)
	private byte active;

	@ManyToOne
	@JoinColumn(name = "country_id", nullable = true)
	private Country country;

}

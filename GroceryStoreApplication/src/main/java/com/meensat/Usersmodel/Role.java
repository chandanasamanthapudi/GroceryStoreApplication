package com.meensat.Usersmodel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String  name;
	 
    @OneToOne(fetch=FetchType.LAZY,cascade= CascadeType.ALL,mappedBy="user")
	private User user;
    
    @OneToOne(fetch=FetchType.LAZY,cascade= CascadeType.ALL,mappedBy="admin")
    private Admin admin;
    
    @OneToOne(fetch=FetchType.LAZY,cascade= CascadeType.ALL,mappedBy="vendor")
    private Vendor vendor;
    
    public Role() {
    	
    }
    public Role(Long id, String name, User user, Admin admin, Vendor vendor) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.admin = admin;
		this.vendor = vendor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
		
    
	
}

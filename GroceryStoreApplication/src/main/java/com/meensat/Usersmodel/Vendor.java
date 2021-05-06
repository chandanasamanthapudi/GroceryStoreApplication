package com.meensat.Usersmodel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId ;
	
	private String emailId;
	
	private Long phoneNumber;
	
	private double location;
	
	private String address;
	
	private String dialog;
	
	private byte[] image;
	
	private String shopName;
	
	private boolean shopOpen;
	
	private boolean isTopPicked;
	
	private int rating;
	
	private boolean accVerified;
	
	private int totalRating;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="vr_id")
	private Role role;

	public Vendor() {
	
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDialog() {
		return dialog;
	}

	public void setDialog(String dialog) {
		this.dialog = dialog;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public boolean isShopOpen() {
		return shopOpen;
	}

	public void setShopOpen(boolean shopOpen) {
		this.shopOpen = shopOpen;
	}

	public boolean isTopPicked() {
		return isTopPicked;
	}

	public void setTopPicked(boolean isTopPicked) {
		this.isTopPicked = isTopPicked;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isAccVerified() {
		return accVerified;
	}

	public void setAccVerified(boolean accVerified) {
		this.accVerified = accVerified;
	}

	public int isTotalRating() {
		return totalRating;
	}

	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}


}	
	

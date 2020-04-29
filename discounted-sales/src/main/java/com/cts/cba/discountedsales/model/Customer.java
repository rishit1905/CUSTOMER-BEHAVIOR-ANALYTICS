package com.cts.cba.discountedsales.model;

public class Customer {

	private int cId;
	private String cName;
	private String email;
	private String mobileNumber;
	private String address;

	public Customer() {
	}

	public Customer(int cId, String cName, String email, String mobileNumber, String address) {
		this.cId = cId;
		this.cName = cName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public int getCId() {
		return cId;
	}

	public void setCId(int cId) {
		this.cId = cId;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
package com.cts.cba.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "cid")
	private int cId;

	@Column(name = "cname", nullable = false)
	private String cName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "mobile", nullable = false)
	private String mobileNumber;

	@Column(name = "addr", nullable = false)
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
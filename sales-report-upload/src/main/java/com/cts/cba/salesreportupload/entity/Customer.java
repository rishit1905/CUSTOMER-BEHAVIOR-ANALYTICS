package com.cts.cba.salesreportupload.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany
	private List<Invoice> invoice;

	public Customer() {
	}

	public Customer(int cId, String cName, String email, String mobileNumber, String address, List<Invoice> invoice) {
		this.cId = cId;
		this.cName = cName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.invoice = invoice;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
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

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}

}
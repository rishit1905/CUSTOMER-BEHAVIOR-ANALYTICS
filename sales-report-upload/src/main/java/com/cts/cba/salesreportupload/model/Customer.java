package com.cts.cba.salesreportupload.model;

import java.util.List;

public class Customer {

	private int cId;
	private String cName;
	private String email;
	private String mobileNumber;
	private String address;

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
package com.cts.cba.salesreportupload.model;

import java.util.Set;

public class Customer {

	private int cId;
	private String cName;
	private String cat;
	private String location;

	private Set<Invoice> invoice;

	public Customer() {
	}

	public Customer(int cId, String cName, String cat, String location, Set<Invoice> invoice) {
		this.cId = cId;
		this.cName = cName;
		this.cat = cat;
		this.location = location;
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

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(Set<Invoice> invoice) {
		this.invoice = invoice;
	}

}
package com.cts.cba.dashboard.entity;

import java.util.Set;

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

	@Column(name = "cat", nullable = false)
	private String cat;

	@Column(name = "location", nullable = false)
	private String location;

	@OneToMany
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
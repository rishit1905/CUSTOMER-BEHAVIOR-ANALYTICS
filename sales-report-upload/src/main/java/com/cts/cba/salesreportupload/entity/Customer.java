package com.cts.cba.salesreportupload.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "customer")
@ApiModel(description = "Details about customer")
public class Customer {
	@Id
	@Column(name = "cid")
	@ApiModelProperty(notes = "Customer ID")
	private int cId;

	@Column(name = "cname", nullable = false)
	@ApiModelProperty(notes = "Customer Name")
	private String cName;

	@Column(name = "cat", nullable = false)
	@ApiModelProperty(notes = "Customer Category")
	private String cat;

	@Column(name = "location", nullable = false)
	@ApiModelProperty(notes = "Customer Location")
	private String location;

	@OneToMany
	@ApiModelProperty(notes = "List of invoices")
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
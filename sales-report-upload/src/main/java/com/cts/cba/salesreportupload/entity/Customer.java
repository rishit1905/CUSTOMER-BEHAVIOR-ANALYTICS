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

	@Column(name = "cat", nullable = false)
	private String category;

	@OneToMany
	private List<Invoice> invoice;

	public Customer() {
	}

	public Customer(int cId, String cName, String category, List<Invoice> invoice) {
		this.cId = cId;
		this.cName = cName;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}

}
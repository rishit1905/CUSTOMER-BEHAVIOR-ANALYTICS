package com.cts.cba.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discount")
public class Discount {
	@Id
	@Column(name = "did")
	private int dId;

	@Column(name = "dname", nullable = false)
	private String dName;

	@Column(name = "descr")
	private String description;

	@Column(name = "dprice", nullable = false)
	private double dPrice;

	public Discount() {
	}

	public Discount(int dId, String dName, String description, double dPrice) {
		this.dId = dId;
		this.dName = dName;
		this.description = description;
		this.dPrice = dPrice;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDPrice() {
		return dPrice;
	}

	public void setDPrice(double dPrice) {
		this.dPrice = dPrice;
	}

}
package com.cts.cba.invoice.model;

public class Discount {
	private int dId;
	private String dName;
	private String description;
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
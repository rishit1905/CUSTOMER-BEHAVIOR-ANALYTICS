package com.cts.cba.salesreportupload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="discount")
@ApiModel(description = "Discount Details")
public class Discount {
	@Id
	@Column(name = "did")
	@ApiModelProperty(notes = "Discount ID")
	private int dId;

	@Column(name = "dname", nullable = false)
	@ApiModelProperty(notes = "Discount Name")
	private String dName;

	@Column(name = "descr")
	@ApiModelProperty(notes = "Discount Description")
	private String description;

	@Column(name = "dprice", nullable = false)
	@ApiModelProperty(notes = "Discount Price")
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
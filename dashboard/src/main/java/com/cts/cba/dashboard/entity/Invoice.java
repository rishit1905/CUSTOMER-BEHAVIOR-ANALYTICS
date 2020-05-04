package com.cts.cba.dashboard.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "invoice")
@ApiModel(description = "Invoice Details")
public class Invoice {
	@Id
	@Column(name = "iid")
	@ApiModelProperty(notes = "Invoice ID")
	private int iId;

	@Column(name = "idate", nullable = false)
	@ApiModelProperty(notes = "Invoice Date")
	private LocalDate iDate;

	@Column(name = "qty", nullable = false)
	@ApiModelProperty(notes = "Invoice Quantity")
	private int quantity;

	@Column(name = "tax", nullable = false)
	@ApiModelProperty(notes = "GST")
	private double tax;

	@Column(name = "tprice", nullable = false)
	@ApiModelProperty(notes = "Shopping Amount")
	private double totalPrice;

	@Column(name = "paymode", nullable = false)
	@ApiModelProperty(notes = "Mode of Payment")
	private String payMode;

	@ManyToMany
	@JoinTable(name = "invoice_product", joinColumns = {
			@JoinColumn(name = "iid", referencedColumnName = "iid", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "pid", referencedColumnName = "pid", nullable = false) })
	@ApiModelProperty(notes = "List of Products Purchased")
	private List<Product> product;

	public Invoice() {
	}

	public Invoice(int iId, LocalDate iDate, int quantity, double tax, double totalPrice, String payMode,
			List<Product> product) {
		this.iId = iId;
		this.iDate = iDate;
		this.quantity = quantity;
		this.tax = tax;
		this.totalPrice = totalPrice;
		this.payMode = payMode;
		this.product = product;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public LocalDate getiDate() {
		return iDate;
	}

	public void setiDate(LocalDate iDate) {
		this.iDate = iDate;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
}
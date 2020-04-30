package com.cts.cba.invoice.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@Column(name = "iid")
	private int iId;

	@Column(name = "idate", nullable = false)
	private LocalDate iDate;
	
	@Column(name = "qty", nullable = false)
	private int quantity;

	@Column(name = "tax", nullable = false)
	private double tax;

	@Column(name ="tprice", nullable = false)
	private double totalPrice;

	@Column(name = "paymode", nullable = false)
	private String payMode;

	@ManyToMany
	private List<Product> product;
	
	@ManyToOne
	private Customer customer;

	public Invoice() {
	}

	public Invoice(int iId, LocalDate iDate, int quantity, double tax, double totalPrice, String payMode,
			List<Product> product, Customer customer) {
		this.iId = iId;
		this.iDate = iDate;
		this.quantity = quantity;
		this.tax = tax;
		this.totalPrice = totalPrice;
		this.payMode = payMode;
		this.product = product;
		this.customer = customer;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
}
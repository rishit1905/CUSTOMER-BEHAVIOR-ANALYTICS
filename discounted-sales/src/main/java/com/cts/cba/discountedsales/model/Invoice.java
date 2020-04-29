package com.cts.cba.discountedsales.model;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private int iId;
	private LocalDate iDate;
	private int quantity;
	private double tax;
	private double totalPrice;
	private String payMode;

	private List<Product> product;
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
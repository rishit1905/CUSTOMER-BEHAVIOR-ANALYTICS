package com.cts.cba.dashboard.model;

import java.util.Set;

public class Product {
	private int pId;
	private String pName;
	private String category;
	private String brand;
	private String description;
	private double price;
	private int stock;

	private Set<Discount> discount;

	public Product() {
	}

	public Product(int pId, String pName, String category, String brand, String description, double price, int stock,
			Set<Discount> discount) {
		this.pId = pId;
		this.pName = pName;
		this.category = category;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.discount = discount;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Set<Discount> getDiscount() {
		return discount;
	}

	public void setDiscount(Set<Discount> discount) {
		this.discount = discount;
	}

}
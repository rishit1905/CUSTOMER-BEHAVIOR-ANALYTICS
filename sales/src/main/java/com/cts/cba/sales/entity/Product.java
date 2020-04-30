package com.cts.cba.sales.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "pid")
	private int pId;

	@Column(name = "pname", nullable = false)
	private String pName;

	@Column(name = "brand", nullable = false)
	private String brand;

	@Column(name = "descr")
	private String description;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "stock", nullable = false)
	private int stock;
	
	@ManyToMany
	private List<Discount> discount;

	public Product() {
	}

	public Product(int pId, String pName, String brand, String description, double price, int stock,
			List<Discount> discount) {
		this.pId = pId;
		this.pName = pName;
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

	public List<Discount> getDiscount() {
		return discount;
	}

	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}

}
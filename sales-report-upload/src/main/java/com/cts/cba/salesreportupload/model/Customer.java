package com.cts.cba.salesreportupload.model;

import java.util.List;

public class Customer {

	private int cId;
	private String cName;
	private String category;

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
package com.cjc.app.fwl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicaldetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicalId;
	private String modelNo;
	private String dealer;
	private String price;
	private String onRoadPrice;
	public int getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(String onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
}

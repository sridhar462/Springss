package com.learnfromexamples.modal;

public class Mobile {
	private String brand;
	private String modelNumber;
	private String cost;
	
	public Mobile() {
	}
	
	public Mobile(String brand, String modelNumber, String cost) {
		super();
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
}

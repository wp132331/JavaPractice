//
//  Car2.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 4. 15..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int max_speed;
	private int price;
	
	public Car2() {
	}
	public Car2(String company, String model, String color, int max_speed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.max_speed = max_speed;
		this.price = price;
	}
	
	public String getCompany() {
		 return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setMax_speed(int newMax_speed) {
		max_speed = newMax_speed;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
}
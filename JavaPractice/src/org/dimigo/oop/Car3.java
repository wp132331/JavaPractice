//
//  Car2.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 4. 15..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class Car3 {

	private String company;
	private String model;
	private String color;
	private int max_speed;
	private int price;

	public Car3() {
		this("undefined", "undefined", "undefined");
	}

	public Car3(String company, String model, String color) {
		this(company, model, color, 0);
	}

	public Car3(String company, String model, String color, int max_speed) {
		this(company, model, color, max_speed, 0);
	}

	public Car3(String company, String model, String color, int max_speed, int price) {
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

	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
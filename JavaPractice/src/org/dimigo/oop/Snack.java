//
//  Snack.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 5. 19..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {
		this(null, null, 0, 0);
	}
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack() {
		System.out.println("이름 : "+name);
		System.out.println("제조사 : "+company);
		System.out.println("가격 : "+String.format("%,d",price)+"원");
		System.out.println("개수 : "+number+"개");
	}
	
	public int calcPrice() {
		return price*number;
	}
}

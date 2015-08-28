//
//  SmartPhone.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 28..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
	}
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println(model+"의 전원을 끕니다.");
	}
	public void pay() {
		System.out.println("현금으로 결제합니다.");
	}
	public void useSpecialFunction() {
		if(this instanceof IPhone)
			System.out.println("AirDrop 기능을 사용합니다.");
		else if(this instanceof Galaxy)
			System.out.println("무선 충전 기능을 이용합니다.");
		else
			System.out.println("기능이 없습니다.");
	}

	public String toString() {
		return "모델명 : "+model+", 제조사 : "+company+", 가격 : "+String.format("%,d",price)+"원";
	}
}

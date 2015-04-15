//
//  CarTest.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class CarTest {
	
	public static void main(String args[]) {
		
//		Car car[] = {new Car(), new Car(), new Car()};
//		
//		car[0].setCompany("현대자동차");
//		car[0].setModel("제네시스");
//		car[0].setColor("검정색");
//		car[0].setMax_speed(225);
//		car[0].setPrice(50000000);
//		
//		car[1].setCompany("기아자동차");
//		car[1].setModel("K7");
//		car[1].setColor("흰색");
//		car[1].setMax_speed(246);
//		car[1].setPrice(40000000);
//		
//		car[2].setCompany("삼성자동차");
//		car[2].setModel("SM7");
//		car[2].setColor("회색");
//		car[2].setMax_speed(200);
//		car[2].setPrice(38000000);
		
		Car2[] car = new Car2[3];
		
		car[0] = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		car[1] = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		car[2] = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("<< 자동차 목록 >>");
		for(int i=0; i<3; i++)
		{
			System.out.println("제조사명 : "+car[i].getCompany());
			System.out.println("모델명 : "+car[i].getModel());
			System.out.println("색상 : "+car[i].getColor());
			System.out.println("최대속도 : "+car[i].getMax_speed()+"km");
			System.out.println("가격 : "+String.format("%,d", car[i].getPrice())+"원");
			System.out.println();
		}
	}
}

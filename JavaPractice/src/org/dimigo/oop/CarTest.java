//
//  CarTest.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class CarTest {
	public void main(String args[])
	{
		Car cars[] = {new Car(), new Car(), new Car()};
		
		cars[0].setCompany("현대자동차");
		cars[0].setModel("제네시스");
		cars[0].setColor("검정색");
		cars[0].setMax_speed(225);
		cars[0].setPrice(50000000);
		
		cars[1].setCompany("기아자동차");
		cars[1].setModel("K7");
		cars[1].setColor("흰색");
		cars[1].setMax_speed(246);
		cars[1].setPrice(40000000);
		
		cars[2].setCompany("삼성자동차");
		cars[2].setModel("SM7");
		cars[2].setColor("회색");
		cars[2].setMax_speed(200);
		cars[2].setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		for(int i=0; i<3; i++)
		{
			System.out.println("제조사명 : "+cars[i].getCompany());
			System.out.println("모델명 : "+cars[i].getModel());
			System.out.println("색상 : "+cars[i].getColor());
			System.out.println("최대속도 : "+cars[i].getMax_speed()+"km");
			System.out.println("가격 : "+String.format("%,d", cars[i].getPrice())+"원");
		}
	}
}

//
//  SmartPhoneTest.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 28..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.abstractclass;

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phone = {
			new IPhone("iPhone 6", "애플", 700000),
			new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone p : phone) {
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
			p.turnOff();
			
			System.out.println();
		}
	}
}

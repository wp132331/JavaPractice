//
//  Galaxy.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 28..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class Galaxy extends SmartPhone {
	public Galaxy() {
		super();
	}
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	public void useWirelessCharging() {
		super.useSpecialFunction();
	}
}

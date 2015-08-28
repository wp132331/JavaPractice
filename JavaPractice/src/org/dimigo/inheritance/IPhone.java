//
//  IPhone.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 28..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class IPhone extends SmartPhone {
	public IPhone() {
		super();
	}
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("애플 페이로 결제합니다.");
	}
	public void useAirDrop() {
		super.useSpecialFunction();
	}
}

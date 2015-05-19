//
//  SnackTest.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 5. 19..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args) {
		
		Snack[] snackArr = null;
		int total = 0;
		
		snackArr = new Snack[]{	new Snack("새우깡", "농심", 1100, 2),
								new Snack("콘칲", "크라운", 1200, 1),
								new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack value:snackArr)
		{
			value.printSnack();
			System.out.println();
			
			total += value.calcPrice();
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d",total)+"원");
	}
}

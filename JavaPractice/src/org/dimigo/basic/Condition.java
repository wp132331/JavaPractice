//
//  Condition.java
//  org.dimigo.basic
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.basic;

public class Condition
{
	public static void main(String[] args)
	{
		String car ="고속버스";
		int distance=0, cost;
		
		switch(car)
		{
		case "고속버스":
			cost = (distance-1)/10*300 + 850;
			break;
		
		case "경차":
			cost = (distance-1)/10*200 + 300;
			break;
			
		default:
			cost = (distance-1)/10*200 + 600;
		}
	
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : "+distance);
		System.out.println("차종 : "+car);
		System.out.println("통행료 : "+cost);
	}
}
//
//  Promotion.java
//  org.dimigo.basic
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.basic;

public class Promotion
{
	public static void main(String[] args)
	{
		int a = 1700000;
		int b = 3;
		int c = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+ a);
		System.out.println("점포 내 직원수 : "+b);
		System.out.println("점포 수 : "+ c);
		System.out.print("연간 인건비 : " + 12L*a*b*c);
	}
}
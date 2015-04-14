//
//  Operator.java
//  org.dimigo.basic
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.basic;

public class Operator
{
	public static void main(String[] args)
	{
		double sa, sb;
		int a=9, b=10;
		double ah=5.8, bh=5.4;
		
		sa=ah*(a+b)/2;
		sb=bh*a;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : "+sa);
		System.out.println("평행사변형 넓이 : "+sb);
		
		if(sa>sb)
			System.out.println("사다리꼴의 넓이가 평행사변형 보다 "+(sa-sb)+" 더 큽니다.");
		else if(sa==sb)
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
		else
			System.out.println("평행사변형의 넓이가 사다리꼴보다 "+(sb-sa)+" 더 큽니다.");
	}
}
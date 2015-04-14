//
//  PrimitiveDataType.java
//  org.dimigo.basic
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.basic;

public class PrimitiveDataType
{
	public static void main(String[] args)
	{
		String Name ="아이유";
		boolean Male=false;
		int Age=23;
		double Height = 161.8;
		float Weight = 44.3f;
		char BloodType = 'A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+Name);
		System.out.println("성별 : "+(Male?"남자":"여자"));
		System.out.println("나이 : "+Age+"세");
		System.out.println("키 : "+Height+"cm");
		System.out.println("몸무게 : "+Weight+"kg");
		System.out.println("혈액형 : "+BloodType+"형");
	}
}
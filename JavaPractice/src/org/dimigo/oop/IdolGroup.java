//
//  IdolGroup.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 5. 27..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유리", "소진", "민아", "혜리", "그외"}
		};
		
		for(int i=0; i<idolGroup.length; i++)
		{
			System.out.println("<< "+idolGroup[i]+" 멤버 >>");
			for(String str:members[i])
				System.out.println(str);
			System.out.println();
		}
	}
}
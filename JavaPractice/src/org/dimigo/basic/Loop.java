//
//  Loop.java
//  org.dimigo.basic
//
//  Created by 정에녹 on 2015. 4. 14..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.basic;

public class Loop
{
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
				System.out.print(i==j?"*":j);
			System.out.println();
		}
	}
}
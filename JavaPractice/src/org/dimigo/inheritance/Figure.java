//
//  Figure.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 17..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure() {
	}
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : ("+centerX+", "+centerY+")");
	}
	
	protected void moveCenter(int x, int y) {
		centerX += x;
		centerY += y;
	}
}

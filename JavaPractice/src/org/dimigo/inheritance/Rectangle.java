//
//  Rectangle.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 17..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height;
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}
}

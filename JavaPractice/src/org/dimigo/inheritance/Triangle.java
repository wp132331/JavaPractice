//
//  Triangle.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 17..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height/2.0;
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}

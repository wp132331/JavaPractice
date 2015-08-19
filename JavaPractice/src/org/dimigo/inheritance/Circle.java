//
//  Circle.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 17..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius) {
		this(0, 0, radius);
	}
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return Math.PI*radius*radius;
	}
	
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}

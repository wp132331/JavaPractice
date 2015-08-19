//
//  FigureTest.java
//  org.dimigo.inheritance
//
//  Created by 정에녹 on 2015. 8. 17..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.inheritance;

public class FigureTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println("원 넓이 : "+String.format("%.1f",c.calcArea()));
		System.out.println("원 넓이 : "+String.format("%.1f",t.calcArea()));
		System.out.println("원 넓이 : "+String.format("%.1f",r.calcArea()));
		
		System.out.println();
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println();
		
		c.moveCenter(5, 5);
		t.moveCenter(5, 5);
		r.moveCenter(5, 5);
		System.out.println("-- 중심좌표 이동 (x, y축 5씩)");

		System.out.println();

		c.printCenter();
		t.printCenter();
		r.printCenter();
	}
}

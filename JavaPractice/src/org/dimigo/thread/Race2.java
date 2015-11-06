//
//  Race.java
//  org.dimigo.thread
//
//  Created by 정에녹 on 2015. 11. 6..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("조준희"));
		Thread t2 = new Thread(new Runner2("성시철"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
		
	}
}

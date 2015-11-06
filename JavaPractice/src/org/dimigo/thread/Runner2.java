//
//  Runner.java
//  org.dimigo.thread
//
//  Created by 정에녹 on 2015. 11. 6..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.thread;

public class Runner2 implements Runnable {

	private String name;
	
	public Runner2() {
	}
	public Runner2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + "출발");
		
		for(int i=100; i>=0; i-=10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " " + i + " 미터");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " 골인");
	}
	
}

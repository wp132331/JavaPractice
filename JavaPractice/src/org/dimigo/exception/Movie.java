//
//  Movie.java
//  org.dimigo.exception
//
//  Created by 정에녹 on 2015. 9. 23..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.exception;

public class Movie {
	
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLimitAge() {
		return limitAge;
	}
}

//
//  AgeCheckException.java
//  org.dimigo.exception
//
//  Created by 정에녹 on 2015. 9. 23..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.exception;

public class AgeCheckException extends Exception {
	
	private static final long serialVersionUID = 123456789123456789L;
	
	public AgeCheckException() {
	}
	public AgeCheckException(Movie movie) {
		super(movie.getTitle()+"은/는 "+movie.getLimitAge()+"세 이상 관람가입니다.");
	}
}

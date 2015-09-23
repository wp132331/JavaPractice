//
//  MovieTest.java
//  org.dimigo.exception
//
//  Created by 정에녹 on 2015. 9. 23..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.exception;

public class MovieTest {

	public static void main(String[] args) {
		try {
			Movie[] movies = {
					new Movie("앤트맨", 12),
					new Movie("사도", 12), 
					new Movie("베테랑", 15)
			};
			
			int age = 13;
			
			for(Movie movie : movies)
				buyTicket(movie, age);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException {
		if(age < movie.getLimitAge())
			throw new AgeCheckException(movie);
		else
			System.out.println(movie.getTitle()+" 영화 재밌게 보세요.");
	}
}

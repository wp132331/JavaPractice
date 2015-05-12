//
//  Question.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 5. 12..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	private Scanner scanner;
	private String answer;
	
	public void Check(String correct) {		
		System.out.print("\n출력값 : ");
		answer = scanner.nextLine();

		if(correct.equals(answer))
			System.out.println("YES\n\n");
		else
			System.out.println("NO\n\n");
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		q.scanner = new Scanner(System.in);
		
		System.out.println("int a = 0;");
		System.out.println("if(++a > 0 && a-- > 0 && a++ > 0 && --a > 0)");
		System.out.println("	a *= 2;");
		System.out.println("System.out.println(a);");
		
		q.Check("1");
		
		System.out.println("System.out.println(true & false | true);");
		
		q.Check("true");
		
		System.out.println("byte a=120, b=10;");
		System.out.println("System.out.println(a+b);");
		
		q.Check("130");
		
		q.scanner.close();
	}
}

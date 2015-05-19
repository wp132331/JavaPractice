//
//  Score.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 5. 13..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, mat, eng;
		
		System.out.print("국어 점수 입력 : ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = scanner.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scanner.nextInt();
		
		System.out.println(new StringBuilder("\n<< 점수 출력 >>"));
		System.out.println(new StringBuilder("국어 점수 : ").append(kor).append(" 점"));
		System.out.println(new StringBuilder("수학 점수 : ").append(mat).append(" 점"));
		System.out.println(new StringBuilder("영어 점수 : ").append(eng).append(" 점"));
		System.out.println(new StringBuilder("총점 : ").append(kor+mat+eng).append(" 점"));
		System.out.println(new StringBuilder("평균 : ").append(String.format("%.1f",(kor+mat+eng)/3.0)).append(" 점"));
		
		scanner.close();
	}
}

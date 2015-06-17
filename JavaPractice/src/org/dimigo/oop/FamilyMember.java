//
//  FamilyMember.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 6. 16..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
	}
}

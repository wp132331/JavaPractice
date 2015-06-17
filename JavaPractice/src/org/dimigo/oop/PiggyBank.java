//
//  PiggyBank.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 6. 16..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName()+" "+amount+"원 넣음");
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
	
	public static void stealMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName()+" "+Integer.min(amount, balance)+"원 훔쳐감");
		balance -= Integer.min(amount, balance);
	}
}

//
//  PiggyBankTest.java
//  org.dimigo.oop
//
//  Created by 정에녹 on 2015. 6. 16..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.oop;

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember f[] = {new FamilyMember("아빠"), new FamilyMember("엄마"),  new FamilyMember("나"), new FamilyMember("남동생")};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(f[0], 10000);
		PiggyBank.putMoney(f[1], 5000);
		PiggyBank.putMoney(f[2], 2000);
		PiggyBank.putMoney(f[3], 1000);
		
		PiggyBank.printBalance();

		PiggyBank.putMoney(f[2], 1000);
		PiggyBank.stealMoney(f[3], 2000);
		
		PiggyBank.printBalance();		
		
		PiggyBank.stealMoney(f[0], 99999);
		
		PiggyBank.printBalance();		
	};
}

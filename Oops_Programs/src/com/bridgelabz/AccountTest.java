package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
	static int account_Balance = 0;
	Scanner scanner = new Scanner(System.in);
	
	static void credit(double amount) {
//		System.out.println("How much amount you would like to deposit : ");
//		int amount1 = scanner.nextInt();
		account_Balance += amount;
		System.out.println(amount + " credited and total available balance is "+account_Balance);
	}

	static void debit(double amount) {
//		System.out.println("Enter the amount you would like to withdraw : ");
//		int amount1 = scanner.nextInt();
		if( amount < account_Balance) {
			account_Balance -= amount;
			System.out.println(amount+ " debited and remaining banalce is "+account_Balance);
		}else {
			System.out.println("Insufficient amount, Kindly credit the amount");
		}
	}

	public static int getAccount_Balance() {
		return account_Balance;
	}

	public static void setAccount_Balance(int account_Balance) {
		AccountTest.account_Balance = account_Balance;
	}
	
	
}


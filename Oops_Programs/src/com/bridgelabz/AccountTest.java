package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
	int account_Balance = 0;
	Scanner scanner = new Scanner(System.in);
	
	void check_Balance() {
		System.out.println("Available Balance is :" +account_Balance);
	}

	void credit() {
		System.out.println("How much amount you would like to deposit : ");
		int amount = scanner.nextInt();
		account_Balance += amount;
		System.out.println(amount + " credited and total available balance is "+account_Balance);
	}

	public void debit() {
		System.out.println("Enter the amount you would like to withdraw : ");
		int amount = scanner.nextInt();
		if( amount < account_Balance) {
			account_Balance -= amount;
			System.out.println(amount+ " debited and remaining banalce is "+account_Balance);
		}else {
			System.out.println("Insufficient amount, Kindly credit the amount");
		}
	}
}

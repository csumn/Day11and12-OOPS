package com.bridgelabz;

import java.util.Scanner;

public class StockAccountManagement {
	final static int MAIN_EXIT = 6;
	public static void main(String[] args) {
		System.out.println("Stock Account Management Program ! \n");
		Scanner sc = new Scanner(System.in);
		StockManager stockManager = new StockManager();
		AccountTest accountTest = new AccountTest();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Select the option from below : " + "\n1.Add Stock" + "\n2.print stock report"+"\n3.Debit Amount"+"\n4.Credit Amount\n"+"5.Check Balance\n"+ MAIN_EXIT+".Exit program");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				stockManager.addStock();
				break;
			case 2:
				stockManager.printStock();
				break;
			case 3:
				accountTest.debit();
				break;
			case 4:
				accountTest.credit();
				break;
			case 5:
				accountTest.check_Balance();
				break;
			case MAIN_EXIT:
				System.out.println("Exit : Program Terminated .......");
				isExit= true;
				break;
			default :
				System.out.println("Kindly Enter a valid option .....");
			}
		}
	}
}
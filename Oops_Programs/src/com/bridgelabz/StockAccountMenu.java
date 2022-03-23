package com.bridgelabz;

import java.util.Scanner;

public class StockAccountMenu {
	final static int MAIN_EXIT = 7;
	public static void main(String[] args) {
		System.out.println("Stock Account Management Program ! \n");
		Scanner sc = new Scanner(System.in);
		StockManager stockManager = new StockManager();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Select the option from below : " + "\n1.Buy Shares" + "\n2.Sell Shares"+"\n3.Credit Amount"+"\n4.Debit Amount\n"+"5.Print Account Balance\n"+ "6.Print Portfolio details\n" +MAIN_EXIT+".Exit program");
			int choice = sc.nextInt();
			int amount;
			String symbol;

			switch (choice) {
			case 1:
				System.out.println("Enter which Stock you want to buy : " );
				symbol = sc.next();
				System.out.println("Enter how much you would like to spend on Share : ");
				amount = sc.nextInt();
				stockManager.buy(amount,symbol);
				break;
			case 2:
				System.out.println("Enter which Stock you would like to sell : ");
				symbol = sc.next();
				System.out.println("Enter the value of Share to be sold : ");
				amount = sc.nextInt();
				stockManager.sell(amount, symbol);
				break;
			case 3:
				System.out.println("Enter the amount to deposit in yout account : ");
				amount = sc.nextInt();
				AccountTest.credit(amount);
				break;
			case 4:
				System.out.println("Enter the amount you would like to withdraw from your account : ");
				amount = sc.nextInt();
				AccountTest.debit(amount);
				break;
			case 5:
				stockManager.valueOf();
				break;
			case 6:
				stockManager.printReport();
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
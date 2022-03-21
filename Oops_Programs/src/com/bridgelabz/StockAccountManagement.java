package com.bridgelabz;

import java.util.Scanner;

public class StockAccountManagement {
	public static void main(String[] args) {
		System.out.println("Stock Account Management Program ! \n");
		Scanner sc = new Scanner(System.in);
		StockManager stockManager = new StockManager();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Select the option from below : " + "\n1.Add Stock" + "\n2.print stock report"+ "\n3.Exit program");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				stockManager.addStock();
				break;

			case 2:
				stockManager.printStock();
				break;
			case 3:
				System.out.println("Exit");
				break;
			default :
				System.out.println("Kindly Enter a valid option .....");
			}
			isExit= false;
		}
	}
}
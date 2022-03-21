package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class StockManager {
	public void addStock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of stocks: ");
		int n = sc.nextInt();      //entering no of stocks to create
		double total_value = 0;
		double value = 0;

		List<StockPortfolio> temp = StockList.getStocks();
		for (int i = 0; i < n; i++) {
			StockPortfolio stock = new StockPortfolio();

			System.out.println("Enter the name of share: ");
			stock.setStock_Name(sc.next());
			System.out.println("Enter number of shares: ");
			stock.setNo_Of_Shares(sc.nextInt());
			System.out.println("Enter price of share: ");
			stock.setShare_Price(sc.nextDouble());

			value = stock.getNo_Of_Shares() * stock.getShare_Price();
			stock.setTotal_Val_Shares(value);
			temp.add(stock);
			StockList.setStocks(temp);
			total_value += value;
		}
		StockList.setTotal_value(total_value);
	}

	public void printStock() {
		List<StockPortfolio> temp = StockList.getStocks();
		for (StockPortfolio stocks : temp) {
			System.out.println(stocks);
		}
		System.out.println("Total value of stock : " + StockList.getTotal_value());
	}
}

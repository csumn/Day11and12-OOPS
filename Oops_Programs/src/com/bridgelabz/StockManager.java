package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class StockManager implements StockAccount{
	Scanner sc = new Scanner(System.in);
	@Override
	public double valueOf() {
		System.out.println("Balance in account is " + AccountTest.getAccount_Balance());
		return AccountTest.getAccount_Balance();
	}
	public StockPortfolio findStock(String name) {
		List<StockPortfolio> temp = StockList.getStocks();

		for (StockPortfolio stock : temp) {
			if (stock.getStock_Name().equals(name)) {
				return stock;
			}
		}
		return null;
	}
	public StockPortfolio createStock(String name) {
		List<StockPortfolio> temp = StockList.getStocks();

		System.out.print("Enter the value of Share : ");
		double price_of_share = sc.nextDouble();

		StockPortfolio stock = new StockPortfolio();
		stock.setStock_Name(name);
		stock.setNo_Of_Shares(0);
		stock.setShare_Price(price_of_share);
		temp.add(stock);

		StockList.setStocks(temp);

		return stock;
	}

	@Override
	public void buy(int amount, String symbol) {
		if (amount>AccountTest.getAccount_Balance()) {
			System.out.println("Insufficient balance.....");
			return;
		}
		StockPortfolio portfolio = findStock(symbol);
		if (portfolio == null) {
			portfolio = createStock(symbol);
		}

		int no_Of_Shares = (int)(amount/portfolio.getShare_Price());
		double debit_Value = no_Of_Shares * portfolio.getShare_Price();
		AccountTest.debit(debit_Value);		
		portfolio.setNo_Of_Shares(no_Of_Shares + portfolio.getNo_Of_Shares());
		portfolio.setTotal_Val_Shares(portfolio.getNo_Of_Shares() * portfolio.getShare_Price());
	}

	@Override
	public void sell(int amount, String symbol) {
		StockPortfolio portfolio = findStock(symbol);

		if (portfolio == null) {
			System.out.println("You do no have this Stock...");
			return;
		}

		int no_of_shares = (int) (amount / portfolio.getShare_Price());

		if (no_of_shares > portfolio.getNo_Of_Shares()) {
			no_of_shares = portfolio.getNo_Of_Shares();
		}
		portfolio.setNo_Of_Shares(portfolio.getNo_Of_Shares() - no_of_shares);
		double stock_value = portfolio.getNo_Of_Shares() * portfolio.getShare_Price();
		portfolio.setTotal_Val_Shares(stock_value);

		double credit_value = portfolio.getShare_Price() * no_of_shares;
		AccountTest.credit(credit_value);		
	}
	@Override
	public void printReport() {
		List<StockPortfolio> temp = StockList.getStocks();
		int value = 0;

		for (StockPortfolio stock : temp) {
			System.out.println(stock);
			value += stock.getTotal_Val_Shares();
		}
		System.out.println("Your portfolio is worth: " + value);
	}
}



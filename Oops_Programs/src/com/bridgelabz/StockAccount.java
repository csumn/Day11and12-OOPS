package com.bridgelabz;

public interface StockAccount {
	double valueOf();
	void buy(int amount, String symbol);
	void sell(int amount, String symbol);
	void printReport();
}

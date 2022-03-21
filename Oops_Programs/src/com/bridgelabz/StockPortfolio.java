package com.bridgelabz;

public class StockPortfolio {

	private String stock_Name;
	private int no_Of_Shares;
	private double share_Price;
	private double total_Val_Shares;

	public String getStock_Name() {
		return stock_Name;
	}

	public void setStock_Name(String stock_Name) {
		this.stock_Name = stock_Name;
	}

	public int getNo_Of_Shares() {
		return no_Of_Shares;
	}

	public void setNo_Of_Shares(int no_Of_Shares) {
		this.no_Of_Shares = no_Of_Shares;
	}

	public double getShare_Price() {
		return share_Price;
	}

	public void setShare_Price(double share_Price) {
		this.share_Price = share_Price;
	}

	public double getTotal_Val_Shares() {
		return total_Val_Shares;
	}

	public void setTotal_Val_Shares(double total_Val_Shares) {
		this.total_Val_Shares = total_Val_Shares;
	}

	@Override
	public String toString() {
		return "StockPortfolio [stock_name = " + stock_Name + ", no_of_shares = " + no_Of_Shares + ", share_price = "
				+ share_Price + ", total_val_shares = " + total_Val_Shares + "]";
	}
}

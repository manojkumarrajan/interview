package com.informatica.alog.sdet;


/*
 *  @author marajan
 * 
  Problem Statement : You are given an array of N integers representing Stock Prices on a single day. 
  					  Find maximum profit that can be earned by performing 1 transaction.
  Solution :
  			You need to have two variables lowestStockPriceTillNow and maxProfitTilNow.
  			Travel through the array or stock price.
  			If current element < lowestStockPriceTillNow that means you need to change the lowestStockPriceTillNow
  				lowestStockePriceTillNow = element
  			if maxProfitTillNow < element - lowestStockPriceTillNow than change maxProfitTillNow
  			 	maxProfitTillNow = element - lowestStockePriceTillNow
  			 	
  Explanation : http://javabypatel.blogspot.in/2016/08/stock-buy-sell-to-maximize-profit.html

 */
public class StockSell {

	public static void main(String[] args) {
		int profit = maximizeProfit(new int[] { 100, 80, 120, 130, 70, 60, 100, 125 });
		System.out.println(profit);
	}

	public static int maximizeProfit(int[] arrStockPrice) {
		if (arrStockPrice == null || arrStockPrice.length < 2) {
			return 0;
		}

		int lowestStockPriceTillNow = arrStockPrice[0];
		int maxProfitTillNow = 0;

		for (int i = 1; i < arrStockPrice.length; i++) {

			if (arrStockPrice[i] < lowestStockPriceTillNow) {
				lowestStockPriceTillNow = arrStockPrice[i];
			} else {
				if (arrStockPrice[i] - lowestStockPriceTillNow > maxProfitTillNow) {
					maxProfitTillNow = arrStockPrice[i] - lowestStockPriceTillNow;
				}
			}
		}
		return maxProfitTillNow;
	}

}

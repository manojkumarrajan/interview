package com.informatica.alog.sdet;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * @author marajan
 * 
 	1) Initialize result as empty.
	2) find the largest denomination that is 
   	smaller than V.
	3) Add found denomination to result. Subtract 
   	value of found denomination from V.
	4) If V becomes 0, then print result.  
   	Else repeat steps 2 and 3 for new value of V
 */

public class MinimumNumberOfCoin {


	public static void main(String[] args) {
		int[] denom = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int value = 555;
		
		ArrayList<Integer> coin = minimumCoin(value, denom);
		Iterator<Integer> itr = coin.iterator();
		System.out.print("Minimum Coin for " + value + " is :: " );
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}
	
	
	
	public static ArrayList<Integer> minimumCoin(int value, int [] denom) {
		ArrayList<Integer> coin = new ArrayList<Integer>();
		for (int i = denom.length-1; i >= 0; i--) {    // extra condition you can put is  && value>0 which will avoid looking more once value is 0
			if (value >= denom[i]) {
				coin.add(denom[i]);
				value = value - denom[i];
			}
		}
		return coin;
		
	}

	/*public static ArrayList<Integer> minimumCoin(int value, int [] denom) {
		ArrayList<Integer> coin = new ArrayList<Integer>();
		int i = denom.length-1;
		while (i >= 0) {
			if (value >= denom[i]) {
				coin.add(denom[i]);
				value = value - denom[i];
			}
			i--;
		}
		return coin;
		
	}*/
}
		
		/*for (int i = denom.length-1; i >=0 || value > 0 ; i--) {
			if(value >= denom[i]){
				coin.add(denom[i]);
				value = value - denom[i];
				System.out.println(value);
				//i++;
				
			}
			
		
		return coin;
	}*/




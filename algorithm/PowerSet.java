package com.informatica.alog.sdet;
public class PowerSet {
	
	/*
	 * @author marajan
	 * 
	  What is Power Set?
		In mathematics, the power set (or powerset) of any set S, written P(S), is the set of all subsets of S, 
		including the empty set and S itself.

	  Understanding this program  --- http://javabypatel.blogspot.in/2015/10/all-subsets-of-set-powerset.html
	  There are to trick whiling solving this problem using bit manipulation
	  How to identify if 0th bit is set in 5?
		Solution: 
		     Step1 - Convert 5 into binary   = 0101
		     Step2 - Do a logical AND with 1 = 0001
		     If the result is greater than 0, then Least Significant bit is set, that means bit at position 0 is set in 5(0101).
		what if i ask you to check if 1st bit is set or not in 5.
			Do a logical AND with 2 (0010)
		what if i ask you to check if bit position at 2 is set or not in 5
		    Do a logical AND with 2 (0011)
	  
	  How to find total number of subsets possible from a set?
	  If you calculate than you will find total number of subset possible will be = 2^n where n is the number of element present in set.
	  So if set is {a,b,c} than 2^3=8 possible subset
	  If set is {a,b,c,d} than 2^4= 16 possible subset
	  
	  How to achieve the calculation using bit manipulation
	  So if set is {a,b,c} that mean n =3 that means 2^3 = 8
	  which can be achieved by 1<<3 (which means shifting the set bit to 3 times 0001<<3 = 1000=8) 
	 
	 */

	public static void main(String[] args) {
		char [] set = {'a','b','c'};
		int i = 0;
		printSubsets(set);

	}
	
	
	static void printSubsets(char set[])
    {
        int n = set.length;
        int count = 1<<n;
 
        for (int i = 0; i < count; i++)
        {
            System.out.print("{ ");
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }

}
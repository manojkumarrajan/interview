package com.informatica.alog.sdet;

import java.util.Arrays;

/*
 * @author marajan
 * 
 * Given arrival and departure times of all trains that reach a railway station, 
 * the task is to find the minimum number of platforms required for the railway station so that no train waits
 */

public class MinNoOfPlatformProblem {



	public static int getMinNoOfPlatform(double[] arrival, double[] depart, int noOfTrains){
	int minNumberOfPlatforms = 0;
	int platformsRequired = 0;
	
	int i = 0;
	int j = 0;
	while(i < noOfTrains) {
		
		if(arrival[i] < depart[j]) {
			platformsRequired++;
			i++;
		} else {
			platformsRequired--;
			j++;
		}
		
		if(minNumberOfPlatforms < platformsRequired)
			minNumberOfPlatforms = platformsRequired;
	}
	
	return minNumberOfPlatforms;
	}

	
public static void main(String[] args) {
		
		double[] arrival   = {9.15, 10.05, 9.20, 9.05, 11.30};// sorted = { 9.05, 9.15, 9.20, 10.05, 11.30}
		double[] departure = {9.25, 10.25, 9.30, 9.45, 11.35};// sorted = { 9.25, 9.30, 9.45, 10.25, 11.35}
		
		System.out.println("Total number of trains = " + arrival.length);
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int minNumberOfPlatforms = getMinNoOfPlatform(arrival, departure, 5);
		System.out.println("Minimum number of platforms required at any time to avoid any train waiting to enter a paltform = " + minNumberOfPlatforms);
	}
	
}




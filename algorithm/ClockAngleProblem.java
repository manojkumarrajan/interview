package com.informatica.alog.sdet;


/* 
 * 
 * @author marajan
 * 
 * Problem statement : Calculate the angle between hour hand and minute hand
 * 
 * 	Calculate the angle between hour hand and minute hand
 * 	Point to remember
 *  The minute hand moves 360 degree in 60 minute(or 6 degree in one minute) = 360/60 = 6 degree per min
 *  And hour hand moves 360 degree in 12 hours(or 0.5 degree in 1 minute) =  360/12*60 = 1/2 or 0.5 degree per min
 *  Example : 9:30
 *  Calculate Hour Angle = Hour * .5 + Min *. 5 = 285
 *  Calculate Minute Angle = Min * 6 = 180
 *  Diff = 285 - 180 = 105
 *  
 * 
 */

public class ClockAngleProblem {

	static int calcAngle(int hour, int min) {
		// validate the input
		if (hour < 0 || min < 0 || hour > 12 || min > 60)
			System.out.println("Wrong input");

		if (hour == 12)
			hour = 0;
		if (min == 60)
			min = 0;

		// Calculate the angles moved by hour and minute hands
		// with reference to 12:00
		
		int hour_angle = (int) (0.5 * (hour * 60) + min * 0.5);
		/*
		 * Why min * 0.5 ? Ans : to get the difference. Let's say 2:20. At 20 mins hour hand will not be at 2, it will move forward.
		 *  How much it has moved is 20 * 0.5
		 */
		int minute_angle = (int) (6 * min);

		// Find the difference between two angles
		int angle = Math.abs(hour_angle - minute_angle);
		// smaller angle of two possible angles
		angle = Math.min(360 - angle, angle);
		return angle;
	}

	// Driver program
	public static void main(String[] args) {
		int min = 0;
		int hour = 0;

		/*Scanner in = new Scanner(System.in);
		System.out.println("Enter Hour");
		hour = in.nextInt();

		System.out.println("Enter Minute");
		min = in.nextInt();
		in.close();

		System.out.println(calcAngle(hour, min) + " degree");*/

		
		System.out.println(calcAngle(9, 30) + " degree");
		System.out.println(calcAngle(3, 30) + " degree");
		System.out.println(calcAngle(12, 00) + " degree");
	}

}

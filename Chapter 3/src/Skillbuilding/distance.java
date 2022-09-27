package Skillbuilding;

import java.text.DecimalFormat;

public class distance {

	public static void main(String[] args) {
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		double seg1 = 12.2;
		double seg2 = 10.6;
		double seg3 = 5.8;
		double total = seg1 + seg2 + seg3;
		System.out.println("The total distance of the race is " + dc.format(total) + "km" );

	}

}

/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int res1 = (int)((Math.random() * (b - a)) + a );
		int res2 = (int)((Math.random() * (b - a)) + a );
		int res3 = (int)((Math.random() * (b - a)) + a );
		int res = Math.min(res1, Math.min(res2, res3));

		System.out.println(res1+"\n"+res2+"\n"+res3+"\nThe minimal generated number was "+res);

		



	}
}

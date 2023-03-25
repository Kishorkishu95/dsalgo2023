/**
 * 
 */
package com.kish.recursion;

/**
 * @author kisho
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factVal = findFact(-2);
		System.out.println("Factorial is : " + factVal);

	}

	private static int findFact(int n) {
		if (n < 1) {
			return -1;
		}
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * findFact(n - 1);
		}
	}

}

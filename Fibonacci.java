/**
 * 
 */
package com.kish.recursion;

/**
 * @author kisho
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibVal = fib(10);
		System.out.println("Fibonacci series sum is :" + fibVal);

	}

	private static int fib(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}

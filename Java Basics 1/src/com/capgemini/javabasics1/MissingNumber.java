
package com.capgemini.javabasics1;

/**
 * @author Pooja Karnik Program to find the missing number from a list of
 *         numbers
 *
 */
public class MissingNumber {

	// logic to find the missing number from the array
	public static void main(String[] args) {

		int array[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int total, sum = 9;

		total = sum * (sum + 1) / 2;
		for (int i = 0; i < sum; i++)
			total = total - array[i];

		System.out.println("Missing Element is : " + total);
	}
}

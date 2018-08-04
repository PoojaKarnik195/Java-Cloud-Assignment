
package com.capgemini.javabasics1;

import java.util.*;

/**
 * @author Pooja Karnik Program to search a number is present in a
 *         multidimensional array or not
 *
 */
public class MultidimensionalArray {

	// taking a search element and passing it to a search function
	public static void main(String[] args) {

		int number;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to be searched from a multidimensional array");
		number = scanner.nextInt();
		int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		search(matrix, 4, number);
	}

	// searching input element from the user and printing if it is present in the
	// array or not
	private static void search(int[][] matrix, int n, int x) {

		int i = 0, j = n - 1;

		while (i < n && j >= 0) {
			if (matrix[i][j] == x) {
				System.out.println(x + " Found at " + i + " " + j);
				return;
			}
			if (matrix[i][j] > x)
				j--;
			else
				i++;
		}

		System.out.println(x + " Element not found");
		return;
	}
}

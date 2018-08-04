
package com.capgemini.javabasics1;

import java.util.*;

/**
 * @author Pooja Karnik Program to calculate 35% discount on an item purchased
 *
 */
public class Discount {

	// taking input from user and calculating the discounted price of that item
	public static void main(String[] args) {

		float newItem, discount = 35, newItemPrice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new item price");
		newItem = scanner.nextInt();
		newItemPrice = newItem - (newItem * discount / 100);

		System.out.println("The new price for the item after discount will be " + newItemPrice);
	}
}

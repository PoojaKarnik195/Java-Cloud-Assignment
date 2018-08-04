
package com.capgemini.javabasics1;

import java.util.*;

/**
 * @author Pooja Karnik Program to remove duplicate characters from a string
 *
 */
public class DuplicateCharacters {

	// taking a string input, checking duplicate characters and removing it
	public static void main(String[] args) {

		int length;
		char character;
		String word, answer = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word : ");
		word = scanner.next();
		length = word.length();

		for (int i = 0; i < length; i++) {
			character = word.charAt(i);
			if (character != ' ') {
				answer = answer + character;
			}
			word = word.replace(character, ' ');
		}

		System.out.println("Word after removing duplicate characters : " + answer);
	}
}

package com.blz.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, remainder, reverse = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		number = scan.nextInt();
		// number = 1234
		// remainder = 1234 % 10 = 4
		// reverse = 0 * 10 + 4 = 0 + 4 = 4
		// number = 1234 / 10 = 123

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("\nnumber is  reverse." + reverse);

	}

}

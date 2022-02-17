package com.blz.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num, i, sum = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = s.nextInt();

		for (i = 1; i < num; i++) {
			if (num % i == 0)
				sum = sum + i;
		}

		if (sum == num)
			System.out.println("\nIt  is a Perfect Number.");
		else
			System.out.println("\nIt is not a Perfect Number.");

	}

}

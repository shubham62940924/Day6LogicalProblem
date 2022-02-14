package com.blz.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		{
			int a = 0, b = 1, c = 0, n;
			Scanner s = new Scanner(System.in);

			System.out.print("Enter the value of n: ");
			n = s.nextInt();

			System.out.print("\nFibonacci Series: " + a + " " + b + " ");
			c = a + b;
			n = n - 2;
			while (n > 0) {
				System.out.print(c + " ");
				a = b;
				b = c;
				c = a + b;
				n--;
			}
		}
	}
}

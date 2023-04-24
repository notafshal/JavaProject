package com.minip;

import java.util.Random;
import java.util.Scanner;

public class BingoGame {
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int rnumber = r.nextInt(100) + 1;
		System.out.println("***Welcome to Bingo***");
		System.out.println("Enter your number for Bingo: ");
		num = sc.nextInt();
		System.out.println("The Bingo number is: " + rnumber);
		if (num < rnumber) {
			System.out.println("Sorry! Your number is low");
		} else if (num > rnumber) {
			System.out.println("Sorry! Your numberis high");
		} else {
			System.out.println("Congratulations on winning the Bingo");
		}

	}

}

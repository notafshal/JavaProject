package com.minip;

import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
		int pick;
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Welcome to Quiz Application*****");
		System.out.println("1) History");
		System.out.println("2) Sports");
		System.out.println("3) Esports");
		System.out.println("4) Music");
		System.out.println("Please choose a category: ");
		pick = sc.nextInt();

		String answer;
		switch (pick) {
		case 1:
			System.out.println("Who unified Nepal into a single state? ");
			answer = input.nextLine();
			if (answer.equals("Prithivi Narayan Shah")) {
				System.out.println("Correct Answer");
			} else {
				System.out.println("Wrong Answer");
			}
			break;
		case 2:
			System.out.println("Who is known as the black pearl in football? ");
			answer = input.nextLine();
			if (answer.equals("Pele")) {
				System.out.println("Correct Answer");
			} else {
				System.out.println("Wrong Answer");
			}
			break;
		case 3:
			System.out.println("Which Nepali team was able to secure 2nd position in PMGC? ");
			answer = input.nextLine();
			if (answer.equals("DRS")) {
				System.out.println("Correct Answer");
			} else {
				System.out.println("Wrong Answer");
			}
			break;
		case 4:
			System.out.println("Which Rapper won the Oscar? ");
			answer = input.nextLine();
			if (answer.equals("Eminem")) {
				System.out.println("Correct Answer");
			} else {
				System.out.println("Wrong Answer");
			}
			break;

		default:
			System.out.println("Wrong Choice!! Please choose between 1 to 4 ");
			System.out.println("Thank you");
		}

	}

}

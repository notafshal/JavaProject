package com.minip;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double num1;
		double num2;
		char operator;
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1: ");
		num1 = sc.nextDouble();
		System.out.println("Number 2: ");
		num2 = sc.nextDouble();
		System.out.println("Enter the operator: ");
		operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

	}
}

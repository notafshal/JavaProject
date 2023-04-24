package com.minip;

import java.util.Date;
import java.util.Scanner;

public class Gradebook {
	String name;
	String gender;
	int grade;
	int roll;
	int english;
	int nepali;
	int math;
	String gradin;
	Scanner sc = new Scanner(System.in);
	Scanner inmarks = new Scanner(System.in);

	void StudentInput() {

		System.out.println("Name: ");
		name = sc.nextLine();

		System.out.println("Gender: ");
		gender = sc.nextLine();

		System.out.println("grade: ");
		grade = sc.nextInt();

		System.out.println("Roll no: ");
		roll = sc.nextInt();
	}

	void Marks() {

		System.out.println("English");
		english = inmarks.nextInt();

		System.out.println("Nepali");
		nepali = inmarks.nextInt();

		System.out.println("Math");
		math = inmarks.nextInt();

	}


	void print() {
		System.out.println("***Student Grade Book***");
		Date date = new Date();
		System.out.printf("%s %tB %<te, %<tY", "Date: ", date);
		System.out.println(" ");
		System.out.println("Name:" + name + "   Grade:" + grade + "   Gender:" + "   Roll no:" + roll);
		System.out.println("English: " + english );
		System.out.println("Nepali: " + nepali);
		System.out.println("Math: " + math );
	}

	public static void main(String[] args) {
		Gradebook gb = new Gradebook();
		gb.StudentInput();
		gb.Marks();
		gb.print();
		

	}
}

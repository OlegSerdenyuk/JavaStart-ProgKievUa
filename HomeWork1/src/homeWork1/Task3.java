package homeWork1;

import java.util.Scanner;

public class Task3 {
	
	/*
	 * Написать программу которая вычислит и выведет на экран длину окружности,
	 * если ее радиус считывается с клавиатуры.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input radius and press 'Enter'...");
		int radius = sc.nextInt();
		System.out.println("The circumference is - " + (int)(2 * Math.PI * radius) + ".");
		sc.close();
	}
}

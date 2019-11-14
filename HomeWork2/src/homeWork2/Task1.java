package homeWork2;

/*
 * Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.
 */

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number1 and press 'Enter':");
		int number1 = sc.nextInt();
		System.out.println("Input number2 and press 'Enter':");
		int number2 = sc.nextInt();
		System.out.println("Input number3 and press 'Enter':");
		int number3 = sc.nextInt();
		System.out.println("Input number4 and press 'Enter':");
		int number4 = sc.nextInt();
		
		int max = number1;
		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		if (number4 > max) {
			max = number4;
		}
		System.out.println("Max number is - " + max + ".");
		sc.close();
	}
}

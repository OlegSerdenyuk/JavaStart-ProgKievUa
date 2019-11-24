package homeWork1;

/*
 * Написать программу которая считывает 5-и значное число с клавиатуры и выводит
 * цифры из которого оно состоит. Например : Считывается число 54698.
 * Выводиться: 5
 * 4
 * 6
 * 9
 * 8
 */

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input your number (five-digit number) and press 'Enter'...");
		int number = sc.nextInt();
		for (;;) {
			if (9999 < number && 100000 > number) {
				System.out.println("Your number is:");
				System.out.println("First - " + number/10000);
				System.out.println("Second - " + number%10000/1000);
				System.out.println("Third - " + number%1000/100);
				System.out.println("Fourth - " + number%100/10);
				System.out.println("Fifth - " + number%10);
			break;
		}
		else
			System.out.println("Sorry, you entered not five-digit number! Restart again, please!");
			break;
		}
		sc.close();
	}
}

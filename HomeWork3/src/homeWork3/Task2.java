package homeWork3;

import java.util.Scanner;

public class Task2 {
	
	/*
	 * Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
	 * Факториал числа это произведение всех чисел от этого числа до 1. Например 5!=5*4*3*2*1=120
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number 'n' (4<n<16) and press 'Enter':");
		int n = sc.nextInt();
		if (n < 4 || n > 16) {
			System.out.println("You entered the wrong number! Please, try again!");
			return;
		}
		long a = 1;
		for (int i = 1; i <= n; i++) {
			a *= i;
		}
		System.out.println("Factorial of your number is: " + a + ".");
		sc.close();
	}

}

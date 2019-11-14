package homeWork2;

/*
 * Определить количество дней в году, который вводит пользователь.
 * В високосном годе - 366 дней, тогда как в обычном 365. Високосный год определяется по следующему правилу: 
 * Год високосный, если он делится на четыре без остатка, но если он делится на 100 без остатка, 
 * это не високосный год. Однако, если он делится без остатка на 400, это високосный год.
 */

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a year and press 'Enter':");
		int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
        	System.out.println("Number of days in a year: " + 366);
        } else {
        	System.out.println("Number of days in a year: " + 365);
        }
        sc.close();
	}
}

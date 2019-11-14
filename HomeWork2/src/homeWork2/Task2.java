package homeWork2;

/*
 * Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
 * На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры,
 * и выведет на экран на каком этаже, какого подъезда расположенна эта квартира.
 * Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of apartment and press 'Enter':");
		int number = sc.nextInt();
		if (number <= 0 || number > 144) {
			System.out.println("You entered the wrong apartment number! Please, try again!");
			return;
		}
		number--;
		int a = number / 36;
		int b = (number / 4) % 9;
		System.out.println("Floor number is: " + ++b + ", " + "and entrance number is: " + ++a + ".");
		sc.close();
	}
}

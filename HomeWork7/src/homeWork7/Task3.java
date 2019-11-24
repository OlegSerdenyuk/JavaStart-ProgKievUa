package homeWork7;

import java.util.Scanner;

public class Task3 {
	
	/*
	 * ¬вести с консоли число в бинарном формате. ѕеревести его в дес€тичный и 
	 * вывести на экран (У10Ф -> 2).
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number in binary format and press 'Enter': ");
		String s = sc.nextLine();
		System.out.println("Your number in decimal format: " + "\"" + s + "\" -> " + Integer.parseInt(s, 2));
		sc.close();
	}
}

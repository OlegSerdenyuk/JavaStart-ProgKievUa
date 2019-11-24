package homeWork3;

import java.util.Scanner;

public class Task1 {
	
	/*
	 * С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры.
	 * В примере 7 полос.
	 * ***+++***+++***+++***
	 * ***+++***+++***+++***
	 * ***+++***+++***+++***
	 * ***+++***+++***+++***
	 * ***+++***+++***+++***
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 'width' and press 'Enter':");
		int width = sc.nextInt();
		int height = 5;
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (j % 2 !=0) {
					System.out.print("***");
				}
				if (j % 2 == 0) {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

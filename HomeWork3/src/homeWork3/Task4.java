package homeWork3;

import java.util.Scanner;

public class Task4 {
	
	/*
	 * �������� �� ����� ������������� �� *. ������ ������ � ������ �������������� �������� � ����������.
	 * �������� ���� ����������� ������������� � ������� 4 � ������� 5.
	 *    *****
	 *    *   *
	 *    *   *
	 *    *****
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 'width' of the rectangle and press 'Enter':");
		int width = sc.nextInt();
		System.out.println("Input 'height' of the rectangle and press 'Enter':");
		int height = sc.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || j == 1 || i == height || j == width) { 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

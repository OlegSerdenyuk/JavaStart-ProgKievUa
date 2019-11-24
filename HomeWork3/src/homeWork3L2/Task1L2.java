 package homeWork3L2;

import java.util.Scanner;

public class Task1L2 {
	
	/*
	 * — помощью цикла (только одного) нарисовать такую фигуру. ѕричем максимальна€ высота этой фигуры
	 * вводитьс€ с клавиатуры (в примере максимальна€ высота - 4).
	 *    *
	 *    **
	 *    ***
	 *    ****
	 *    ***
	 *    **
	 *    *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		System.out.println("Input 'height' and press 'Enter':");
		int height = sc.nextInt();
	
		for (; i < (2 * height - 1);) {
			if (j >= (height - Math.abs(height - 1))) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
		}
		sc.close();
	}
}

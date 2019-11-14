package homeWork2L2;

/*
 * Есть круг с центром в начале координат и радиусом 4. Пользователь вводит с клавиатуры 
 * координаты точки x и y. Написать программу которая определит лежит ли эта точка внутри круга или нет.
 */

import java.util.Scanner;

public class Task1L2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a point coordinates 'x' and press 'Enter':");
		int x = sc.nextInt();
		System.out.println("Input a point coordinates 'y' and press 'Enter':");
		int y = sc.nextInt();
		int radius = 4;
		
		int z = (int)Math.sqrt((x * 2) + (y * 2));
		if (z <= radius) {
			System.out.println("Yes! This point is inside the circle.");
		} else {
			System.out.println("No! This point is not inside the circle. Sorry, try again!");
		}
		sc.close();
	}
}

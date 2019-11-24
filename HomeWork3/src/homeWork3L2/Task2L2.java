package homeWork3L2;

public class Task2L2 {
	
	/*
	 * — помощью циклов вывести на экран все простые числа от 1 до 100. ѕростое число Ч
	 * число которое делитьс€ нацело только на единицу или само на себ€.
	 * ѕервые простые числа это Ч 2,3,5,7Е
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
				}
			System.out.println(i);;
			}
		}
	}
}

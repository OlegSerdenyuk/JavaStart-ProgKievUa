package homeWork5;

public class Task1 {
	
	/*
	 * Напишите метод который вернет максимальное число из массива целых чисел.
	 */

	public static void main(String[] args) {
		int[] array = {2, 5, 13, 0, -5, 20, 4, 7, -8, 3, 18};
		System.out.println("Your maximum number from an array is: " + method2(array) + ".");

	}
	
	public static int method2 (int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}

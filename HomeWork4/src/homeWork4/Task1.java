package homeWork4;

public class Task1 {
	
	/*
	 * Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
	 */

	public static void main(String[] args) {
		int b = 0;
		int[] array = {0, 5, 2, 4, 7, 1, 3, 19};
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				b++;
			}
		}
		System.out.println("The number of odd digits of the array is: " + b);
	}
}

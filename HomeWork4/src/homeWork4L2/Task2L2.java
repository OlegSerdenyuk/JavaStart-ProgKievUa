package homeWork4L2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2L2 {
	
	/*
	 * Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). - массив может быть 
	 * произвольной длинны. (При выполнении задания использовать дополнительный массив нельзя)(1 час)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of the array and press 'Enter':");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Input the element of the array and press 'Enter':");
			array[i] = sc.nextInt();
		}
		int b = array.length;
		int temp;
		for (int i = 0; i < b / 2; i++) {
			temp = array [b - i - 1];
			array [b - i - 1] = array[i];
			array[i] = temp;
		}
		for (int i = 0; i < array.length; i++) {
		}
		System.out.print("Flip your array is: " + Arrays.toString(array));
		sc.close();
	}
}

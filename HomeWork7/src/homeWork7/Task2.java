package homeWork7;

import java.util.Random;

public class Task2 {
	
	/*
	 * Написать свой вариант метода Arrays.toString() для int[].
	 */

	public static void main(String[] args) {
		int[] array = new int[15];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) rn.nextInt(11);
		}
		System.out.println(method2(array));
	}

	public static String method2(int[] a) {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			if (i != a.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(']');
		return sb.toString();
	}
}

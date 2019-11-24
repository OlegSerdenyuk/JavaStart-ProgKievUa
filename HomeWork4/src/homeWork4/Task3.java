package homeWork4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
	
	/*
	 * Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза больше, 
	 * первые 15 элементов должны быть равны элементам первого массива, а остальные элементы заполнить 
	 * удвоенных значением начальных. Например 
	 * Было → {1,4,7,2} 
	 * Стало → {1,4,7,2,2,8,14,4}
	 */

	public static void main(String[] args) {
		int[] array1 = new int [15];
		Random rn = new Random();
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)rn.nextInt(11);
		}
		int[] array2 = new int [30];
		array2 = Arrays.copyOf(array1, 30);
		for (int i = 0; i < array1.length; i++) {
			array2[i + array1.length] = array1[i] * 2;
			
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
}

package homeWork5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
	
	/*
	 * Напишите метод который реализует линейный поиск элемента в массиве целых чисел. 
	 * Если такой элемент в массиве есть то верните его индекс, если нет то метод должен 
	 * возвращать число - «-1».
	 */

	public static void main(String[] args) {
		int[] array = new int [10];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)rn.nextInt(11);
		}
		
		System.out.println(Arrays.asList(array).indexOf(b));
	}

	public static int method2 (int a, int[] array) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == b) {
				return i;
			}
		}
		return -1;
	}
}

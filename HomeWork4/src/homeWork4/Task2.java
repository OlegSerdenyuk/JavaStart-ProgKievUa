package homeWork4;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
	
	/*
	 * �������� ��� ��� ����������� �������� ������� ����� ����� (������ ��������� � ����������) 
	 * � ����������� ���������� ������� ��� �������� �������. �������� ���� ������ �� �����.
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
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}

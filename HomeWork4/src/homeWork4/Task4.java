package homeWork4;

import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
	
	/*
	 * ������� ������ ������ � ���������� � ���������� ��������� ��� ����������� �������� 
	 * ���������� ������� � 'b' � ���� ������, � ������� ��������� �� �����.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string and press 'Enter':");
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		int c = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'b') {
				c++;
			}
		}
		System.out.println("Number of 'b' in this string is: " + c);
		sc.close();
	}
}

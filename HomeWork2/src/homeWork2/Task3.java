package homeWork2;

/*
 * ���������� ���������� ���� � ����, ������� ������ ������������.
 * � ���������� ���� - 366 ����, ����� ��� � ������� 365. ���������� ��� ������������ �� ���������� �������: 
 * ��� ����������, ���� �� ������� �� ������ ��� �������, �� ���� �� ������� �� 100 ��� �������, 
 * ��� �� ���������� ���. ������, ���� �� ������� ��� ������� �� 400, ��� ���������� ���.
 */

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a year and press 'Enter':");
		int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
        	System.out.println("Number of days in a year: " + 366);
        } else {
        	System.out.println("Number of days in a year: " + 365);
        }
        sc.close();
	}
}

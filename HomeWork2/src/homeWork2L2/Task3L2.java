package homeWork2L2;

/*
 * ���������, �������� �� �������������� ����� ���������� �������. ���� �������������� �����. 
 * ���������, �������� �� ��� ����������� �������. ����������: ���������� ������� ���������� �����, 
 * � ������� - ��� ������ ���������� ���� � ����� ����� ���� ��� ����� �������� ����� ����� ���� 
 * ��� ������ ��������. ��������, ���������� ����� 1322. ��� ����� �������� ����� 13, � ������ � 22, 
 * � ��� �������� ���������� ������� (�. �. 1 + 3 = 2 + 2)
 */

import java.util.Scanner;

public class Task3L2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a four-digit number and press 'Enter':");
		int number = sc.nextInt();
		
		if ((number/1000) + (number%1000/100) == (number%100/10) + (number%10/1)) {
			System.out.println("Congratulations! Your number is a lucky ticket. You are lucky");
		} else {
			System.out.println("Sorry! Your number is not a lucky ticket. You are a loser! Try again.");
		}
		sc.close();
	}
}

package homeWork2L2;

/*
 * ��� ����������� ���������� ������ �(0,0), �(4,4), �(6,1). ������������ ������ � ���������� 
 * ���������� ����� x � y. �������� ��������� ������� ��������� ����� �� ��� ����� ������ ������������ ��� ���.
 */

import java.util.Scanner;

public class Task2L2 {

	public static void main(String[] args) {
		int x1 = 0;
		int y1 = 0;
		int x2 = 4;
		int y2 = 4;
		int x3 = 6;
		int y3 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a point coordinates 'x' and press 'Enter':");
		int x = sc.nextInt();
		System.out.println("Input a point coordinates 'y' and press 'Enter':");
		int y = sc.nextInt();
		
		
		if (((x-x1)*(y1-y2)-(y-y1)*(x1-x2)>=0) && ((x-x2)*(y2-y3)-(y-y2)*(x2-x3)>=0) && ((x-x3)*(y3-y1)-(y-y3)*(x3-x1)>=0)) {
			System.out.println("Yes! This point is inside the triangle.");
		} else {
			System.out.println("No. This point is not inside the triangle. Sorry, try again!");
		}
		sc.close();
	}
}

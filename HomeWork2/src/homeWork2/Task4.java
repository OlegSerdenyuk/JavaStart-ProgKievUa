package homeWork2;

/*
 * ����������� ���������� ������ �����, ����� ����� ����� ���� ��� ������ ������ �������. 
 * ����: a, b, c � ������� ��������������� ������������. �������� ��������� ������� ������ 
 * ���������� ����� ����������� ��� ���.
 */

public class Task4 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int c = 5;
		
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("Yes! This triangle exists.");
		} else {
			System.out.println("No! This triangle does not exists. Sorry, try again!");
		}
	}
}

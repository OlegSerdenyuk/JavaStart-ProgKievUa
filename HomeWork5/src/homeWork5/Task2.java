package homeWork5;

public class Task2 {
	
	/*
	 * ���������� ����� ����������� �������� �������� - ����� �����, ������������ ����� � ������. 
	 * ���������� �� ������������ ������ � ������ ������������� � ������ �����.
	 */

	public static void main(String[] args) {
		int a = 5;
		double b = 5.5;
		String s = "Hello";
		
		System.out.println("Concatenation string with the sum of a real number and an integer is: " + method2(a, b, s));
	}

	public static String method2 (int a, double b, String s) {
		String result =  s + (a + b);
		return result;
	}
}

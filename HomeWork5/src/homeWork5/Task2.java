package homeWork5;

public class Task2 {
	
	/*
	 * Реализуйте метод параметрами которого являются - целое число, вещественное число и строка. 
	 * Возвращает он конкатенацию строки с суммой вещественного и целого числа.
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

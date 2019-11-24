package homeWork5;

public class Task5 {
	
	/*
	 * Напишите метод который вернет количество слов в строке текста.
	 */

	public static void main(String[] args) {
		String s = "Hello World!";
		int a = 0;
		a = method2(s, a);		
		System.out.println(a);
	}

	public static int method2 (String a, int b) {
		char[] array = a.toCharArray();
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				c++;
			}
		}
		c++;
		return c;
	}
}

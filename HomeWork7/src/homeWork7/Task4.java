package homeWork7;

public class Task4 {
	
	/*
	 * Выведите на экран 10 строк со значением числа Пи. Причем в первой строке должно 
	 * быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.
	 */

	public static void main(String[] args) {
		for (int i = 2; i <= 11; i++) {
			System.out.println("PI value is: " + String.format("%." + i + "f", Math.PI));
		}
	}
}

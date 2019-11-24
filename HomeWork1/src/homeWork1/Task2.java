package homeWork1;

/*
 * Написать программу которая вычислит и выведет на экран площадь
 * треугольника если известны его стороны.
 */

public class Task2 {

	public static void main(String[] args) {
		int size1 = 15;
		int size2 = 13;
		int size3 = 10;
		
		int p = ((size1 + size2 + size3))/2;
		System.out.println("Area of a triangle is - " + (int)Math.sqrt(p*(p-size1)*(p-size2)*(p-size3)) + ".");
	}
}

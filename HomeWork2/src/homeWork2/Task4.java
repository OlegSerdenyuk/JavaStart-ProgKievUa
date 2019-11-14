package homeWork2;

/*
 * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. 
 * Дано: a, b, c – стороны предполагаемого треугольника. Напишите программу которая укажет 
 * существует такой треугольник или нет.
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

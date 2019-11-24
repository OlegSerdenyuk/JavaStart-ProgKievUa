package homeWork5;

public class Task3 {
	
	/*
	 * –еализуйте метод рисующий на экране пр€моугольник из звездочек Ђ*ї Ч его параметрами 
	 * будут целые числа которые описывают длину и ширину такого пр€моугольника.
	 */

	public static void main(String[] args) {
		int height = 5;
		int width =  10;
		
		method2(height, width);	
	}

	public static void method2 (int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (a == i || i == 1 || b == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

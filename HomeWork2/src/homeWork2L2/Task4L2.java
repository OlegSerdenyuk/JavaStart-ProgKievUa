package homeWork2L2;

/*
 * — клавиатуры вводитьс€ шестизначное число. ѕроверить, €вл€етс€ ли оно палиндромом. 
 * ѕримечание: палиндромом называетс€ число, слово или текст, которые одинакового читаютс€ 
 * слева направо и справа налево. Ќапример, это числа 143341, 5555, 7117 и т. д.
 */

import java.util.Scanner;

public class Task4L2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a six-digit number and press 'Enter':");
		int number = sc.nextInt();
		
		if ((number/100000) == (number%10) && (number%100000/10000) == (number%100/10) && (number%10000/1000) == (number%1000/100)) {
			System.out.println("Congratulations! Your number is a palindrome. You are lucky");
		} else {
			System.out.println("Sorry! Your number is not a palindrome. You are a loser! Try again.");
		}
		sc.close();
	}
}

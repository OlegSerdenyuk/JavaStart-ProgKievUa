package homeWork7;

public class Task4 {
	
	/*
	 * �������� �� ����� 10 ����� �� ��������� ����� ��. ������ � ������ ������ ������ 
	 * ���� 2 ����� ����� �������, �� ������ 3, � ������� 4 � �.�.
	 */

	public static void main(String[] args) {
		for (int i = 2; i <= 11; i++) {
			System.out.println("PI value is: " + String.format("%." + i + "f", Math.PI));
		}
	}
}

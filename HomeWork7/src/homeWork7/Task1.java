package homeWork7;

import java.util.Calendar;
import java.util.Date;

public class Task1 {
	
	/*
	 * �������� ��������� ������� ������ ���������� ����������� ��������� �� ������ �� �����, 
	 * �� � ������� ������ �� ����������� ����. �������� ���� ������� 3 �������, �� ������ 
	 * ������� ����������� ������ � 3 ����.
	 */

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
        cl.add(Calendar.MONTH, -1);
        Date date2 = cl.getTime();
        Date date3 = new Date();
        
        System.out.println("A month ago it was: " + date2);
		System.out.println("Today is: " + date3);
		
        long l = date3.getTime() - date2.getTime();
        System.out.println("Milliseconds have passed in a month ago is: " + l);
	}
}

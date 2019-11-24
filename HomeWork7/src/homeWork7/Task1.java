package homeWork7;

import java.util.Calendar;
import java.util.Date;

public class Task1 {
	
	/*
	 * Написать программу которая вернет количество миллисекунд прошедших от такого же числа, 
	 * но в прошлом месяце до сегодняшней даты. Например если сегодня 3 августа, то узнать 
	 * сколько миллисекунд прошло с 3 июля.
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

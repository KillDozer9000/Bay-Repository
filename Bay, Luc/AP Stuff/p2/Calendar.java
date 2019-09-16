package p2;

import java.util.GregorianCalendar;

public class Calendar 
{
	public static void main(String[] args)
	{
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.add(GregorianCalendar.DAY_OF_MONTH, 100);
		System.out.println("100 days froms now: "+cal1.get(GregorianCalendar.MONTH)+"/"+cal1.get(GregorianCalendar.DAY_OF_MONTH)+"/"+cal1.get(GregorianCalendar.YEAR));
		
		GregorianCalendar birthday = new GregorianCalendar(2002, GregorianCalendar.MAY, 5);
		System.out.println("Birthday: "+birthday.get(GregorianCalendar.MONTH)+"/"+birthday.get(GregorianCalendar.DAY_OF_MONTH)+"/"+birthday.get(GregorianCalendar.YEAR));
	
		birthday.add(GregorianCalendar.DAY_OF_MONTH, 10000);
		System.out.println("10000 days later: "+birthday.get(GregorianCalendar.MONTH)+"/"+birthday.get(GregorianCalendar.DAY_OF_MONTH)+"/"+birthday.get(GregorianCalendar.YEAR));
	}
}

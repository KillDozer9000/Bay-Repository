package SOWJCode;

import java.util.Scanner;

public class Chp5Pc2
{
	static Scanner fromKeyboard = new Scanner(System.in);
	public static void getdistance(int time, int speed)
	{
		if(speed <= 0)
		{
			System.out.print("Hour | Distance\n");
			int count = 1;
			int distance = 0;
			for(;count<=time; count++)
			{
				distance = count*speed;
				System.out.print(count+"       ");
				System.out.print(distance +"\n");
			}
		}
		else
			System.out.print("not valid \n");
	}

	public static void main(String[] args)
	{	
		getdistance(3, 40);
	}
}
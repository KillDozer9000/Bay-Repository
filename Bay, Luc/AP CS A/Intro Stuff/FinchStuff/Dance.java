package FinchStuff;

import java.util.Scanner;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import processing.core.PApplet;

public class Dance
{
	static Scanner fromKeyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Finch myFinch = new Finch();
		int enemy = 0;
		int counter = 0;
		boolean level = myFinch.isFinchLevel();
		myFinch.saySomething("How many seconds do you want to run?", 2000);
		System.out.print("How many seconds do you want to run?: \n");
		int seconds = fromKeyboard.nextInt();
		seconds = seconds*35;

//		System.currentTimeMillis();
		
		while(counter <= seconds && level == true)
		{
			boolean shaken = myFinch.isShaken();
			counter++;
			//System.out.print(counter+"\n");

			if(shaken == true)
			{
				myFinch.setLED(255, 0 ,0);
				enemy++;
			}
			else if(shaken == false)
			{
				myFinch.setLED(0, 255 ,0);
			}
		}
		System.out.print("I saw "+enemy+" enemies\n");
		myFinch.sleep(300000000);
		myFinch.quit();
    }
}

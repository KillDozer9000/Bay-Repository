package FinchStuff;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import processing.core.PApplet;

public class basicdance extends PApplet
{
    public static void main(String[] args)
    {
        Finch myFinch = new Finch();
        int count = 0;
        int r = 34;
        int g = 139;
        int b = 34;
        myFinch.setLED(r, g, b);
        myFinch.saySomething("This time we are going to get funky, Everybody clap your hands Clap clap clap clap your hands Clap clap clap clap your hands, Everybody clap your hands Clap clap clap clap your hands Clap clap clap clap your hands Everybody clap your hands Clap clap clap clap your hands Clap clap clap clap your hands Everybody clap your hands Clap clap clap clap your hands Clap clap clap clap your hands", 0);
        while(count <=3)
        {
        		r = (int)(Math.random() * 255);
        		g = (int)(Math.random() * 255);
        		b = (int)(Math.random() * 255);
        		myFinch.setLED(r, g, b);
        		myFinch.buzz(1600, 1000);
        		myFinch.setWheelVelocities(100, 100, 1000);
        		myFinch.buzz(1800, 1000);
        		myFinch.setWheelVelocities(-200, 100, 1000);
        		myFinch.buzz(2000, 1000);
        		myFinch.setWheelVelocities(100, -200, 1000);
        		myFinch.setWheelVelocities(-100, -100, 1000);
        		myFinch.buzz(1800, 10000);
        		myFinch.buzz(1600, 9000);
        		myFinch.buzz(1400, 8000);
        		myFinch.buzz(1200, 7000);
        		myFinch.buzz(1000, 6000);
        		myFinch.buzz(800, 5000);
        		count++;
        }
        myFinch.sleep(30000);
        myFinch.quit();
    }
}
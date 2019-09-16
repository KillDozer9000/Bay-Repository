package FinchStuff;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import processing.core.PApplet;

public class Draw extends PApplet
{
    public static void main(String[] args)
    {
        Finch myFinch = new Finch();
        myFinch.setLED(0,255,0 ,2000);
        myFinch.buzz(1400, 2000);
        myFinch.setWheelVelocities(50, 50, 2000);
        myFinch.sleep(30000);
        myFinch.quit();
    }
}

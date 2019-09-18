package FinchStuff;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import processing.core.PApplet;

public class FinchTemplateFile extends PApplet
{
    public static void main(String[] args)
    {
        Finch myFinch = new Finch();
        myFinch.saySomething("This time we are going to get funky Everybody clap your hands Clap clap clap clap your handsClap clap clap clap your hands", 5000);
        myFinch.sleep(30000);
        myFinch.quit();
    }
}

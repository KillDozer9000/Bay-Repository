package trafficlight;

import processing.core.PApplet;

public class Lightrunner extends PApplet
{
	Light l = new Light(this, 500/4);
	Light r = new Light(this, (500*3)/4);
	int time = 1000;
	int origtime = time;
	boolean left = true;
	boolean right = false;
	
	public static void main (String[] args)
	{
		PApplet.main("trafficlight.Lightrunner");
	}
    public void settings()
    {
        size(500, 540);
    }
    public void setup()
    {
    		background(100,100,100);
    		l.makered();
    		noStroke();
    		
    		fill(50,50,50);
    		rect(245, 0, 10, 540);
    }
    public void draw()
    {
    
    		if(millis() >= time)
    		{ 		
    			drawing();
    			time = millis() + origtime;
   		}
    			
    }
    		
    	public void drawing()
    	{
		if(l.getred())
		{
			left = true;
			right = false;
		}
		if(r.getred())
		{
			left = false;
			right = true;
		}
			
		if(left)
			r.changenext();
		if(right)
			l.changenext();
		
		l.draweverything();
		r.draweverything();
    	}
}

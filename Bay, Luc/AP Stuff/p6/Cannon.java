package p6;

public class Cannon 
{
	private double initvx, initvy,time, x, y;
	private double interval = 0.000001;
	
	public Cannon(double initv, double a)
	{
		initvx = initv*Math.cos(a*Math.PI/180);
		initvy = initv*Math.sin(a*Math.PI/180);
	}
	
	private double getX()
	{
		return time*initvx;
	}
	
	private double getY()
	{
		return (initvy*time) - (4.9*(Math.pow(time, 2)));
	}
	
	private void step()
	{
		time += interval;
		x = getX();
		y = getY();
	}
	
	public String getDist2()
	{
		String str = "";
		
		while(y >= 0)
		{
			if((Math.abs((int)(time)- time)) < interval)
			{
				str += "\n\nTime: "+Math.round(time);
				str += "\nHorizontal: "+x;
				str += "\nVertical: "+y;
			}
				step();
		}
		
		str += "\n\nTime: "+time;
		str += "\nHorizontal: "+x;
		str += "\nVertical: "+Math.round(y);
		
		return str;
	}
}

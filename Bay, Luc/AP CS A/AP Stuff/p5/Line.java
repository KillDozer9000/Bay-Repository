package p5;

import java.awt.geom.Point2D;
import java.util.Scanner;


public class Line 
{
	private String eq;
	private double m;
	
	
	//format: y = -mx + b
	public Line(Point2D.Double point, double slope)
	{
		eq = "y = "+slope+"x + "+(-1*(slope*point.getX() - point.getY()));
		m = slope;
	}
	
	public Line(Point2D.Double p1, Point2D.Double p2)
	{
		m = ((p2.getY()-p1.getY())/(p2.getX()-p1.getX()));
		eq = "y = "+m+"x + "+((-1*((p2.getY()-p1.getY())/(p2.getX()-p1.getX())*p1.getX() - p1.getY())));
	
		m *= 10;
		m *= (int)(((p2.getY()-p1.getY())/(p2.getX()-p1.getX())));
		m /= 10;
	}
	
	public Line(String equation)
	{
		eq = equation;
		
		String chop = eq.substring(eq.indexOf("=")+1, eq.indexOf("x"));
		m = Double.parseDouble(chop);

	}
	
	public Line(String equation, boolean vertical)
	{
		if(vertical)
		{
			eq = equation;
			m = 0;
		}
		else
			eq = equation;
		
	}
	
	public boolean intersects(Line other)
	{
		if(m != other.m)
			return true;
		else
			return false;
	}
	
	public boolean equals(Line other)
	{
		if(eq.compareTo(other.eq) == 0)
			return true;
		else
			return false;
	}
	
	public boolean isParallel(Line other)
	{
		if(m == other.m)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return eq;
	}
}

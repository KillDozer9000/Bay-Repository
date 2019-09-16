package SOWJCode;

public class Chp3Pc4 
{
	private String descrip;
	private int units;
	private double price;
	
	public Chp3Pc4(String de, int un, double pr)
	{
		descrip = de;
		units = un;
		price = pr;
	}
	
	public String setdescrip(String de)
	{
		descrip = de;
		return descrip;
	}
	public int setunits(int un)
	{
		units = un;
		return units;
	}
	public double setprice(double pr)
	{
		price = pr;
		return price;
	}
	public String getdescrip()
	{
		return descrip;
	}
	public double getprice()
	{
		return price;
	}
	public int getunits()
	{
		return units;
	}
	
}

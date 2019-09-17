package p5;

public class UnitConverter 
{
	String u1, u2;
	double num;
	
	//mm, cm, in, ft, m, mi, km
	public UnitConverter(String unit1, String unit2, double num)
	{
		u1 = unit1;
		u2 = unit2;
		this.num = num;
	}
	
	public double convert()
	{
		switch(u1)
		{
			case "in": num *= 0.0254; break;
			case "ft": num *= 0.3048; break;
			case "mi": num *= 1609.34; break;
			case "mm": num *= 0.001; break;
			case "cm": num *= 0.01; break;
			case "m" : num *= 1; break;
			case "km": num *= 1000; break;
		}
		switch(u2)
		{
			case "in": num *= 39.3701; break;
			case "ft": num *= 3.28084; break;
			case "mi": num *= 0.000621371; break;
			case "mm": num *= 1000; break;
			case "cm": num *= 100; break;
			case "m":  num *= 1; break;
			case "km": num *= 0.001; break;
		}
		return num;
	}
}

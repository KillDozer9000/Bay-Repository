package p10;

public class Worker 
{
	private String name;
	private double salary;
	
	public Worker(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public double salary()
	{
		return salary;
	}
	
	public String name()
	{
		return name;
	}
}

package p3;

public class Employee 
{
	private String name;
	private double salary;
	
	public Employee(String employeename, double currentSalary)
	{
		name = employeename;
		salary = currentSalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		salary += salary*(byPercent/100);
	}
}

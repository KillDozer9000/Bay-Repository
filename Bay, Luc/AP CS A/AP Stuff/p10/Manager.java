package p10;

public class Manager extends Employee
{
	private String department;

	public Manager(String name, int salary, String department)
	{
		super(name, salary);
		this.department = department;
	}
	
	public String toString()
	{
		return super.toString() + " Department: "+department;
	}
}

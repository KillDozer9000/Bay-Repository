package p3;

public class EmployeeTester 
{
	public static void main(String[] args)
	{
		Employee harry = new Employee("Harry", 5000);
		System.out.println("Name: "+harry.getName()+"\nSalary: $"+harry.getSalary());
		
		harry.raiseSalary(10);
		System.out.println("\nName: "+harry.getName()+"\nSalary: $"+harry.getSalary());
	}
}

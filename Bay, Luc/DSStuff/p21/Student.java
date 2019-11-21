package p21;

public class Student 
{
	String first, last;
	int id;
	
	public Student(String first, String last, String grade, int id)
	{
		this.first = first;
		this.last = last;
		this.id = id;
	}
	
	public String toString()
	{
		return first + " " + last;
	}
}

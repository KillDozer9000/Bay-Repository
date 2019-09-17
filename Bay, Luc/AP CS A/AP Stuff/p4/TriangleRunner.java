package p4;

public class TriangleRunner 
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle(1,-2,3,2,8,6);
		
		System.out.println("First side: "+t1.sideLength(1,2));
		System.out.println("Second side: "+t1.sideLength(1,3));
		System.out.println("Third side: "+t1.sideLength(2,3));
		
		System.out.println("\nPerimeter: "+t1.perimeter());
		
		System.out.println("\nFirst angle: "+t1.angles(1));
		System.out.println("Second angle: "+t1.angles(2));
		System.out.println("Third angle: "+t1.angles(3));
		
		System.out.println("\nArea: "+t1.area());
	}
}

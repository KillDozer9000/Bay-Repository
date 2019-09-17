package p4;

public class Triangle 
{
    //Java doc found in doc/project4_1_part1/Triangle.html
	
	private int x1, y1, x2, y2, x3, y3;
	
	/**
	 * Constructor for the triangle
	 * @param x1 the x coordinate for the first corner
	 * @param y1 the y coordinate for the first corner
	 * @param x2 the x coordinate for the second corner
	 * @param y2 the y coordinate for the second corner
	 * @param x3 the x coordinate for the third corner
	 * @param y3 the y coordinate for the third corner
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;	
	}
	
	/**
	 * Finds the length of one side
	 * @param corner1 the first corner to use, the first, second or third corner
	 * @param corner2 the second corner to use, the first, second or third corner
	 * @return the length of the side
	 */
	public double sideLength(int corner1, int corner2)
	{
		// L = ((x2-x1)^2 - (y2-y1)^2)^.5
		if((corner1 == 1 && corner2 == 2) || (corner1 == 2 && corner2 == 1))
			return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		else if((corner1 == 1 && corner2 == 3) || (corner1 == 3 && corner2 == 1))
			return Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3-y1), 2));
		else if((corner1 == 2 && corner2 == 3) || (corner1 == 3 && corner2 == 2))
			return Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2-y3), 2));
		else
			return 0;
	}
	
	/**
	 * Finds the perimeter of the triangle
	 * @return The perimeter
	 */
	public double perimeter()
	{	
		return sideLength(1,2) + sideLength(2,3) + sideLength(1,3);
	}
	
	/**
	 * Finds the angle of one corner
	 * @param corner the desired corner, the first, second or third corner
	 * @return The angle in degrees
	 */
	public double angles(int corner)
	{
		// angle = arccos((b^2 + c^2 - a^2) / 2bc)
		if(corner == 1)
			return (Math.acos((Math.pow(sideLength(1,3), 2) + Math.pow(sideLength(1,2), 2) - Math.pow(sideLength(2,3), 2)) / (2*(sideLength(1,2)*sideLength(1,3)))))*180/Math.PI;
		else if(corner == 2)
			return (Math.acos((Math.pow(sideLength(2,3), 2) + Math.pow(sideLength(2,1), 2) - Math.pow(sideLength(1,3), 2)) / (2*(sideLength(2,3)*sideLength(2,1)))))*180/Math.PI;
		else if(corner == 3)
			return (Math.acos((Math.pow(sideLength(3,1), 2) + Math.pow(sideLength(3,2), 2) - Math.pow(sideLength(1,2), 2)) / (2*(sideLength(3,1)*sideLength(3,2)))))*180/Math.PI;
		else
			return 0;
	}
	
	/**
	 * Finds the area of the triangle
	 * @return The area
	 */
	public double area()
	{
		// A = .5(a)(b)(sinA)
		double s = (sideLength(1,2) + sideLength(1,3) + sideLength(2,3))/2;
		return Math.sqrt(s*(s-sideLength(1,2))*(s-sideLength(1,3))*(s-sideLength(2,3)));
	}
	
	
	
}

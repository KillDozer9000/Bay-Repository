package p7;

public class MagicSquare 
{
	int size = 0;
	int x = 0;
	int y = 0;
	int n = 1;
	int[][] matrix;
	
	public MagicSquare(int n)
	{
		matrix = new int[n][n];
		
		this.size = n;
		x = n-1;
		y = (n-1)/2;
		
		matrix[x][y] = 1;
	}
	
	public String toString()
	{
		String str = "";
		
		for(int i=0; i<size; i++)
		{
			System.out.print("\n");
			for(int j=0; j<size; j++)
				System.out.print(matrix[i][j]+" ");
		}
		
		return str;
	}
	
	private void moveX()
	{
		if(x == size-1)
			x = 0;
		else
			x++;
	}
	
	private void moveY()
	{
		if(y == size-1)
			y = 0;
		else
			y++;
	}
	
	public void increment()
	{
		n++;
		
		moveX();
		moveY();
		
		if(matrix[x][y] != 0)
		{
			if(x == 0)
				x = size-1;
			else
				x--;
			if(x == 0)
				x = size-1;
			else
				x--;
			
			if(y == 0)
				y = size-1;
			else
				y--;
		}	
		
		matrix[x][y] = n;
	}
	
	public void move()
	{
		for(int i=0; i<(size*size)-1; i++)
			increment();
	}
	
}

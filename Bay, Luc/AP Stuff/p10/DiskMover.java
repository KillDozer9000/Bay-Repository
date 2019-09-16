package p10;

public class DiskMover
{
	public static void main(String[] args)
	{
		
	}
	
    public static void move(int disks, int source, int target)
    {
    	if(disks == 0)
    		move(disks, source, target);
    	
    	int inter = 0;
    	
        move(disks-1, source, inter);
        move(1, source, target);
        move(disks-1, inter, target);
    }
}
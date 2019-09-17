package p13;

public class DiskMover
{
	public static void main(String[] args)
	{
		move(3, 1, 3);
	}
	
    public static void move(int disks, int source, int target)
    {
        if(disks <= 1 || source == target)
        	return;
        
        int inter = 0;
        
        if((source == 1 && target == 2) || (source == 2 && target == 1))
        	inter = 3;
        else if((source == 1 && target == 3) || (source == 3 && target == 1))
        	inter = 2;
        else
        	inter = 1;  
        
        move(disks-1, source, inter);
        move(disks, source, target);
        move(disks-1, inter, target);
    }
}
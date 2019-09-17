package p13;

public class Biggest 
{
	public static int biggest(int[] nums, int start, int end)
	{
		if(end == 1)
			return nums[start];
		
		int biggest = biggest(nums, start, end-1);
		
		if(nums[end-1] > biggest)
			return nums[end-1];
		
		return biggest;
	}
	
	public static int biggest(int[] nums)
	{
		return biggest(nums, 0, nums.length);
	}
	public static void main(String[] args) 
	{
		int[] nums = {1, 2, 6, 4, 5};
		System.out.print(biggest(nums));
	}

}

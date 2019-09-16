package p13;

public class Sum 
{
	public static int sum(int[] nums, int start, int end)
	{
		if(end == 1)
			return nums[0];
		
		return nums[end-1] + sum(nums, start, end-1);
	}
	
	public static int sum(int[] nums)
	{
		return sum(nums, 0, nums.length);
	}
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3};
		System.out.print(sum(nums));
	}

}

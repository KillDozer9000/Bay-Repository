package SOWJCode;

import java.util.Arrays;

public class Ch7Swap 
{
	public static void swap(int pos1, int pos2, int[] array)
	{
		pos1 -= 1;
		pos2 -= 1;
		int first = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = first;
		System.out.print(Arrays.toString(array));
	}
	public static void main(String[] args)
	{
		int[] array = {4,5,6,7,8};
		swap(1,3,array);
	}
}

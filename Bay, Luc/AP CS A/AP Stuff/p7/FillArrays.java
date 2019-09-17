package p7;

import java.util.ArrayList;

public class FillArrays {

	public static void main(String[] args) 
	{
		int[] a1 = new int[10];
		
		for(int i=0; i<a1.length; i++)
			a1[i] = i;
		
		for(int i=0; i<a1.length; i++)
			a1[i] = i*2;
		
		for(int i=0; i<a1.length; i++)
			a1[i] = i +1+2*i;
		
		for(int i=0; i<a1.length; i++)
			a1[i] = 0;
		
		//??
		
		for(int i=0; i<a1.length; i++)
		{
			a1[i] = (int) ((Math.random()*100));
			
			for(int j=i-1; j>=0;j--)
				if(a1[i] == a1[j])
					a1[i] = (int) ((Math.random()*100));
		}
		
		int[] a2 = new int[10];
		boolean same = true;
		
		for(int i=0; i<a1.length; i++)
			if(a1[i] != a2[i])
				same = false;
		
		for(int i=0; i<a1.length; i++)
			a2[i] = a1[i];
		
		for(int i=0; i<a1.length; i++)
			a1[i] = 0;
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0; i<a1.length; i++)
			al1.remove(i);

	}

}

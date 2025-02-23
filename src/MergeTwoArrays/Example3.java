package MergeTwoArrays;

import java.util.Arrays;

public class Example3 
{

	public static void main(String[] args)
	{
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {6,7,8,9,10};
		
		int merged[]= new int[ar1.length + ar2.length];
		
		System.arraycopy(ar1, 0, merged, 0, ar1.length);
		System.arraycopy(ar2, 0, merged, ar1.length, ar2.length);
		
		System.out.println(Arrays.toString(merged));

	}
}

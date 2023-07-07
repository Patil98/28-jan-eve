package Array_Practice;

import java.util.Arrays;

public class example2_intArrayDeclaration_InitializationInSingleStep
{
	
	public static void main(String[] args)
	{
		
		int ar[]= {10,50,40,30,60,20,};
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		
		System.out.println("---print all data---");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		Arrays.sort(ar);
		
		System.out.println("--print data in ascending--");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----print data in descending---");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}

}
